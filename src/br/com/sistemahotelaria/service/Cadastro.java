package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.dao.HospedeDAO;
import br.com.sistemahotelaria.dao.QuartoDAO;
import br.com.sistemahotelaria.errors.Erros;
import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.model.Reserva;
import br.com.sistemahotelaria.model.Status;
import br.com.sistemahotelaria.view.View;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import static br.com.sistemahotelaria.errors.Erros.input;

public class Cadastro {
    public HospedeDAO hospedeDAO = new HospedeDAO();
    public QuartoDAO quartoDAO = new QuartoDAO();

    public void hospede(){
        View.texto("\n _________________________");
        View.cabecalho("|    CADASTRAR HÓSPEDE    |");
        View.cabecalho("|_________________________|");
        View.texto("Nome:");
        String nome = input.nextLine();
        View.texto("Documento:");
        String documento = input.nextLine();
        View.texto("Telefone:");
        String telefone = input.nextLine();

        var hospede = new Hospede(nome, documento, telefone);
        try{
            hospedeDAO.InserirHospede(hospede);
            View.texto("Hospede cadastrado com sucesso!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void quarto(){
        View.texto("\n _________________________");
        View.cabecalho("|    CADASTRAR  QUARTO    |");
        View.cabecalho("|_________________________|");
        View.texto("Número:");
        int numero = Erros.entradaInt();
        View.texto("Tipo:");
        String tipo = input.nextLine();
        View.texto("Preço:");
        double preco = Erros.entradaDouble();

        var quarto = new Quarto(numero, tipo, preco);
        try{
            quartoDAO.InseriQuarto(quarto);
            View.texto("Quarto cadastrado com sucesso!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void reserva(){
        List<Hospede> hospedeList = hospedeDAO.listarHospede();
        List<Quarto> quartoList = quartoDAO.listarQuarto();
        boolean valido = false;
        View.texto("\n _________________________");
        View.cabecalho("|    CADASTRAR HOSPEDE    |");
        View.cabecalho("|_________________________|");

        if(hospedeList.isEmpty()){
            View.texto("Nenhum hóspede cadastrado!");
        } else {
            View.texto("HOSPEDES DISPONÍVEIS:");
            for(Hospede h : hospedeList){
                View.texto("--------------------------");
                System.out.println(h);
             }
            Hospede hospede = null;
            while(!valido){
                View.texto("ID do hóspede:");
                int idHospede = Erros.entradaInt();
                for(Hospede h : hospedeList){
                    if(h.getId() == idHospede){
                        hospede = h;
                        valido = true;
                        break;
                    }
                }
                if(!valido){
                    View.texto("Hóspede inválido!");
                }
            }
            if(quartoList.isEmpty()){
                View.texto("Nenhum quarto cadastrado!");
            } else {
                valido = false;
                for(Quarto q : quartoList){
                    View.texto("--------------------------");
                    System.out.println(q);
                }
                Quarto quarto = null;
                while(!valido){
                    View.texto("ID do quarto:");
                    int idQuarto = Erros.entradaInt();
                    for(Quarto q : quartoList){
                        if(q.getId() == idQuarto){
                            quarto = q;
                            valido = true;
                            break;
                        }
                    }
                    if(!valido){
                        View.texto("Quarto inválido!");
                    }
                }
                View.texto("Data de entrada:");
                LocalDate dataEntrada = Erros.dataObrigatoria();
                View.texto("Data de saída:");
                LocalDate dataSaida = Erros.dataObrigatoria();
                var reserva = new Reserva(hospede, quarto, dataEntrada, dataSaida, Status.valueOf("ATIVA"));

            }
        }
    }
}
package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.errors.TratamentoDeErros;
import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.model.Reserva;
import br.com.sistemahotelaria.model.Usuario;
import br.com.sistemahotelaria.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    private static final Scanner input = new Scanner(System.in);

    public static Hospede cadastroHospede() {
        Hospede hosp = new Hospede();

        do {
            View.textoCadastro("Nome");
        } while (!hosp.setNome(input.nextLine()));

        do {
            View.textoCadastro("Documentos");
        } while (!hosp.setDocumento(input.nextLine()));

        do {
            View.textoCadastro("Telefone");
        } while (!hosp.setTelefone(input.nextLine()));

        return hosp;
    }

    public static Quarto CadastroQuarto() {
        Quarto quar = new Quarto();

        do {
            View.textoCadastro("Numero");
        } while (!quar.setNumero(input.nextLine()));
        do {
            View.textoCadastro("Tipo");
        } while (!quar.setTipo(input.nextLine()));


        do {
            View.textoCadastro("Preço");
        }while (!quar.setPreco(input.nextLine()));

    return quar;
    }

    public static Reserva CadastroDeReserva(){
        Reserva res = new Reserva();
        Quarto quarto = new Quarto();
        Hospede hosp = new Hospede();

        do {
            View.textoCadastro("Numero do Quarto");
            int numero = TratamentoDeErros.Erros();
            List<Quarto> listQuarto = Service.getQuartoList();

            for(Quarto q : listQuarto){
                if(q.getNumero().equalsIgnoreCase(String.valueOf(numero))){
                    quarto = q;
                    break;
                }
            }
            if(quarto == null){
                View.semCadastro();
            }
        }while(quarto.getNumero() == null || quarto.getNumero().isEmpty());
        res.setQuarto(quarto);

        do {
            View.textoCadastro("Ativo true/false");
        }while (!res.setAtiva(Boolean.parseBoolean(input.nextLine())));

        do {
            View.textoCadastro("Data de Entrada");
        }while (!res.setDataEntrada(TratamentoDeErros.dataObrigatoria()));

        do {
            View.textoCadastro("Data de Saida");
        }while(!res.setDataSaida(TratamentoDeErros.dataObrigatoria()));

        do {
            View.textoCadastro("Nome do Hospede");
            String nome = input.nextLine();
            List<Usuario> listHospede = Service.getUsuarioList();

            for(Usuario h : listHospede){
                if(h instanceof Hospede){
                    if(h.getNome().equalsIgnoreCase(nome)){
                        hosp = (Hospede) h;
                        break;
                    }
                }
            }
        }while(hosp.getNome() == null || hosp.getNome().isEmpty());
        res.setHospede(hosp);

        return res;
    }
}
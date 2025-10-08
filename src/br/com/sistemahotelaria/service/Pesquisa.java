package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.dao.HospedeDAO;
import br.com.sistemahotelaria.dao.QuartoDAO;
import br.com.sistemahotelaria.dao.ReservaDAO;
import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.model.Reserva;
import br.com.sistemahotelaria.view.View;

import java.util.List;

import static br.com.sistemahotelaria.errors.Erros.input;

public class Pesquisa {
    public HospedeDAO hospedeDAO = new HospedeDAO();
    public QuartoDAO quartoDAO = new QuartoDAO();
    public ReservaDAO reservaDAO = new ReservaDAO();

    public void listarHospede(){
        List<Hospede> hospedeList = hospedeDAO.listarHospede();
        for(Hospede h : hospedeList){
            View.texto("--------------------------");
            System.out.println(h);
        }
    }

    public void listarQuarto(){
        List<Quarto> quartoList = quartoDAO.listarQuarto();
        for(Quarto q : quartoList){
            View.texto("--------------------------");
            System.out.println(q);
        }
    }

    public void listarReserva(){
        List<Reserva> reservaList = reservaDAO.listarReservas();
        for(Reserva r : reservaList){
            View.texto("--------------------------");
            System.out.println(r);
        }
    }

    public void pesquisarHospede(){
        View.texto("\n _________________________");
        View.cabecalho("|    PESQUISAR HOSPEDE    |");
        View.cabecalho("|_________________________|");

        View.texto("Nome:");
        String nome = input.nextLine();

    }
}
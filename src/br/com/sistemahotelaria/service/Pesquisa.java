package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.dao.HospedeDAO;
import br.com.sistemahotelaria.dao.QuartoDAO;
import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.view.View;

import java.util.List;

public class Pesquisa {
    public HospedeDAO hospedeDAO = new HospedeDAO();
    public QuartoDAO quartoDAO = new QuartoDAO();

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


}
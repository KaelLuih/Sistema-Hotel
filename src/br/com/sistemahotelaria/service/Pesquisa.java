package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.model.Reserva;
import br.com.sistemahotelaria.view.View;

import java.util.ArrayList;

public class Pesquisa {
    static String entrada;
    public static void pesquisa(ArrayList list, View view, Object object){
        entrada = view.pesquisaHospede();
        boolean encontrado = false;

        if(list.isEmpty()){
            view.semCadastro();
        } else {
            for(Object obj : list){
                if(obj instanceof Hospede){
                    if(((Hospede) obj).getNome().equalsIgnoreCase(entrada)){
                        view.listarHospede((Hospede) obj);
                        encontrado = true;
                        break;
                    }
                } else if(obj instanceof Quarto){
                    if(((Quarto) obj).getTipo().equalsIgnoreCase(entrada)){
                        view.listarQuarto((Quarto) obj);
                        encontrado = true;
                        break;
                    }
                } else if(obj instanceof Reserva) {
                    if (((Reserva) obj).getHospede().getNome().equalsIgnoreCase(entrada)) {
                        view.listarReserva((Reserva) obj);
                        break;
                    }
                }
            }
            if(!encontrado){
                view.nEncontrado();
            } else {
                view.encontrado();
            }
        }
    }
}
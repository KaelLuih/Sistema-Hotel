package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.errors.TratamentoDeErros;
import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.model.Reserva;
import br.com.sistemahotelaria.model.Usuario;
import br.com.sistemahotelaria.view.View;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private static List<Usuario> usuarioList = new ArrayList<>();
    private static List<Quarto> quartoList = new ArrayList<>();
    private static List<Reserva> reservaList = new ArrayList<>();

    public static boolean gerenciar(int escolha, View view) {
        boolean continuar = true;
        switch (escolha) {
            case 1 -> {
                escolha = view.menuHospede();
                switch (escolha) {
                    case 1 -> {
                        Hospede hosp = CadastroHospede.cadastrar();
                        usuarioList.add(hosp);
                    }
                    case 2 -> {
                        if(quartoList.isEmpty()){
                            view.semCadastro();
                        } else {
                            view.cabecalho("TODOS OS HÓSPEDES CADASTRADOS");
                            for(Usuario hosp : usuarioList){
                                if(hosp instanceof  Hospede) {
                                    view.listarHospede((Hospede) hosp);
                                }
                            }
                        }
                    }
                    case 3 -> {
                        Hospede hosp = null;
                        Pesquisa.pesquisa((ArrayList) usuarioList, view, hosp);
                    }
                    case 4 -> {

                    }
                }
            }
            case 2 -> {
                escolha = view.menuQuarto();
                switch (escolha){
                    case 1->{

                    }
                    case 2->{
                        view.cabecalho("TODOS OS QUARTOS CADASTRADOS");
                        if(quartoList.isEmpty()){
                            view.semCadastro();
                        } else {
                            for(Quarto quarto : quartoList){
                                view.listarQuarto(quarto);
                            }
                        }
                    }
                    case 3->{
                        Quarto quarto = null;
                        Pesquisa.pesquisa((ArrayList) quartoList, view, quarto);
                    }
                }
            }
            case 3 -> {
                escolha = view.menuReserva();
                switch (escolha){
                    case 1->{

                    }
                    case 2->{
                        view.cabecalho("TODAS AS RESERVAS CADASTRADAS");
                        if(reservaList.isEmpty()){
                            view.semCadastro();
                        } else {
                            for(Reserva reserva : reservaList){
                                view.listarReserva(reserva);
                            }
                        }
                    }
                    case 3->{
                        Reserva reserva = null;
                        Pesquisa.pesquisa((ArrayList) reservaList, view, reserva);
                    }
                }
            }
            case 0 -> {
                continuar = false;
            }
        }
        return  continuar;
    }
}

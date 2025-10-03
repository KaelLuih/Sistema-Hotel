package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.model.Reserva;
import br.com.sistemahotelaria.view.View;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private static List<Usuario> usuarioList = new ArrayList<>();
    private static List<Quarto> quartoList = new ArrayList<>();
    private static List<Reserva> reservaList = new ArrayList<>();

    public static boolean gerenciar(int escolha, View view) {
        boolean continuar = true;
        boolean encontrado = false;

        switch (escolha) {
            case 1 -> { // HÓSPEDE
                escolha = view.menuHospede();
                switch (escolha) {
                    case 1 -> { // Cadastrar
                        Hospede hosp = Cadastro.cadastroHospede();
                        usuarioList.add(hosp);
                    }
                    case 2 -> { // Listar
                        if (usuarioList.isEmpty()) view.semCadastro();
                        else {
                            view.cabecalho("TODOS OS HÓSPEDES CADASTRADOS");
                            for (Usuario hosp : usuarioList) {
                                if (hosp instanceof Hospede) view.listarHospede((Hospede) hosp);
                            }
                        }
                    }
                    case 3 -> { // Pesquisar
                        encontrado = false;
                        view.cabecalho("PESQUISAR HÓSPEDE");
                        String nome = view.lerEntrada("Digite o nome do hóspede: ");
                        for (Usuario u : usuarioList) {
                            if (u instanceof Hospede h && h.getNome().equalsIgnoreCase(nome)) {
                                view.listarHospede(h);
                                encontrado = true;
                                break;
                            }
                        }
                        if(!encontrado){
                            view.nEncontrado();
                        }
                    }
                    case 4 -> { // Editar
                        Edicao.editarHospede(usuarioList, view);
                    }
                }
            }

            case 2 -> { // QUARTO
                escolha = view.menuQuarto();
                switch (escolha) {
                    case 1 -> { // Cadastrar
                        Quarto quarto = Cadastro.CadastroQuarto();
                        quartoList.add(quarto);
                    }
                    case 2 -> { // Listar
                        if (quartoList.isEmpty()) view.semCadastro();
                        else {
                            view.cabecalho("TODOS OS QUARTOS CADASTRADOS");
                            for (Quarto q : quartoList) view.listarQuarto(q);
                        }
                    }
                    case 3 -> { // Pesquisar
                        encontrado = false;
                        view.cabecalho("PESQUISAR QUARTO");
                        String numero = view.lerEntrada("Digite o número do quarto: ");
                        for (Quarto q : quartoList) {
                            if (q.getNumero().equalsIgnoreCase(numero)) {
                                view.listarQuarto(q);
                                encontrado = true;
                                break;
                            }
                        }
                        if(!encontrado){
                            view.nEncontrado();
                        }
                    }
                    case 4 -> { // Editar
                        Edicao.editarQuarto(quartoList, view);
                    }
                }
            }

            case 3 -> { // RESERVA
                escolha = view.menuReserva();
                switch (escolha) {
                    case 1 -> { // Cadastrar
                        Reserva reserva = Cadastro.CadastroDeReserva();
                        reservaList.add(reserva);
                    }
                    case 2 -> { // Listar
                        if (reservaList.isEmpty()) view.semCadastro();
                        else {
                            view.cabecalho("TODAS AS RESERVAS CADASTRADAS");
                            for (Reserva r : reservaList) view.listarReserva(r);
                        }
                    }
                    case 3 -> { // Pesquisar
                        encontrado = false;
                        view.cabecalho("PESQUISAR RESERVA");
                        String nome = view.lerEntrada("Digite o nome do hóspede da reserva: ");
                        for (Reserva r : reservaList) {
                            if (r.getHospede() != null && r.getHospede().getNome().equalsIgnoreCase(nome)) {
                                view.listarReserva(r);
                                break;
                            }
                        }
                        if(!encontrado){
                            view.nEncontrado();
                        }
                    }
                    case 4 -> { // Cancelar
                        String nome = view.lerEntrada("Digite o nome do hóspede da reserva: ");
                        for (Reserva r : reservaList) {
                            if (r.getHospede() != null && r.getHospede().getNome().equalsIgnoreCase(nome)) {
                                view.listarReserva(r);
                                escolha = view.cancelarReserva();
                                switch (escolha){
                                    case 1 ->{
                                        r.setAtiva(false);
                                        view.reservaCancelada();
                                    }
                                }
                                break;
                            }
                        }
                    }
                    case 5 -> // Editar
                        Edicao.editarReserva(reservaList, view);
                }
            }

            case 0 -> { // Sair
                continuar = false;
                view.encerrar();
            }
        }

        return continuar;
    }

    public static List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public static List<Quarto> getQuartoList() {
        return quartoList;
    }

    public static List<Reserva> getReservaList() { return reservaList; }
}

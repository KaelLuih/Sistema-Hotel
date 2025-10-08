package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.errors.Erros;
import br.com.sistemahotelaria.view.View;

public class Service {
    private static Cadastro cd = new Cadastro();
    private static Pesquisa psq = new Pesquisa();

    public static void executar(){
        int opcao = -1;
        while (opcao != 0){
            View.menu();
            opcao = Erros.entradaInt();
            switch (opcao){
                case 1 ->{ //hospede
                    View.menuHospede();
                    opcao = Erros.entradaInt();
                    switch (opcao){
                        case 1 -> //cadastrar
                            cd.hospede();

                        case 2 -> //listar
                            psq.listarHospede();

                        case 3 ->{ //pesquisar

                        }
                        case 4 ->{ //editar

                        }
                    }
                }
                case 2 ->{ //quarto
                    View.menuQuarto();
                    opcao = Erros.entradaInt();
                    switch (opcao){
                        case 1 -> //cadastrar
                            cd.quarto();

                        case 2 -> //listar
                            psq.listarQuarto();

                        case 3 ->{ //pesquisar

                        }
                        case 4 ->{ //editar

                        }
                    }
                }
                case 3 ->{ //reserva
                    View.menuReserva();
                    opcao = Erros.entradaInt();
                    switch (opcao){
                        case 1 -> //cadastrar
                            cd.reserva();

                        case 2 -> //listar
                            psq.listarReserva();

                        case 3 ->{ //pesquisar

                        }
                        case 4 ->{ //cancelar

                        }
                        case 5 ->{ //editar

                        }
                    }
                }
                case 0 ->
                    View.texto("Sistema encerrado.");
            }
        }
    }
}

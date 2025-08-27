package br.com.sistemahotelaria.view;

import br.com.sistemahotelaria.errors.TratamentoDeErros;
import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.model.Reserva;

import java.util.Scanner;

public class View {
    private static Scanner sc;

    public View(){
        sc = new Scanner(System.in);
    }

    public static int menu(){
        System.out.println("\n ______________________________");
        System.out.println("|             HOTEL            |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Gerenciar hóspedes        |");
        System.out.println("| 2. Gerenciar quartos         |");
        System.out.println("| 3. Gerenciar reservas        |");
        System.out.println("|------------------------------|");
        System.out.println("| 0. Sair do sistema           |");
        System.out.println("|______________________________|");
        return TratamentoDeErros.Erros();
    }

    public int menuHospede(){
        System.out.println("\n ______________________________");
        System.out.println("|           HÓSPEDES           |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Cadastrar hóspede         |");
        System.out.println("| 2. Listar todos os hóspedes  |");
        System.out.println("| 3. Pesquisar hóspede         |");
        System.out.println("| 4. Editar dados              |");
        System.out.println("|______________________________|");
        return TratamentoDeErros.Erros();
    }

    public int menuQuarto(){
        System.out.println("\n ______________________________");
        System.out.println("|            QUARTOS           |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Cadastrar quarto          |");
        System.out.println("| 2. Listar todos os quartos   |");
        System.out.println("| 3. Pesquisar quarto          |");
        System.out.println("|______________________________|");
        return TratamentoDeErros.Erros();
    }

    public int menuReserva(){
        System.out.println("\n ______________________________");
        System.out.println("|           RESERVAS           |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Cadastrar reserva         |");
        System.out.println("| 2. Listar todas reserva      |");
        System.out.println("| 3. Pesquisar reserva         |");
        System.out.println("| 4. Cancelar reserva          |");
        System.out.println("|______________________________|");
        return TratamentoDeErros.Erros();
    }

    public int cancelarReserva(){
        System.out.println(" ____________________________");
        System.out.println("|      CANCELAR RESERVA      |");
        System.out.println("|----------------------------|");
        System.out.println("| Deseja cancelar a reserva? |");
        System.out.println("| 1. Sim                     |");
        System.out.println("| 2. Não                     |");
        System.out.println("|____________________________|");
        return TratamentoDeErros.Erros();
    }

    public void reservaCancelada(){
        System.out.println("\nReserva cancelada com sucesso.");
    }

    public void cabecalho(String texto){
        System.out.println("\n-- " + texto + " --");
    }

    public static void opcao(){
        System.out.print("> ");
    }

    public static void erro(){
        System.out.print("\nErro: ");
    }

    public static void textoCadastro(String texto){
        System.out.print("\n" + texto + ": ");
    }

    public static void semCadastro(){
        System.out.println("\nNenhum cadastro disponivel.");
    }

    public void nEncontrado(){
        System.out.println("\nNenhum registro encontrado.");
    }

    public void encontrado(){
        System.out.println("\nEnter para voltar ao menu");
        sc.nextLine();
    }

    public void listarHospede(Hospede h){
        System.out.println("\n" + h);
    }

    public void listarQuarto(Quarto q){
        System.out.println("\n" + q);
    }

    public void listarReserva(Reserva r){
        System.out.println("\n" + r);
    }

    public String pesquisaHospede(){
        System.out.println("\n ____________________________");
        System.out.println("| PESQUISAR HÓSPEDE POR NOME |");
        System.out.println("|----------------------------|");
        System.out.println("| Insira o nome do hóspede:  |");
        System.out.println("|____________________________|");
        System.out.print("> ");
        return sc.nextLine();
    }

    public String pesquisaQuarto(){
        System.out.println("\n ____________________________");
        System.out.println("| PESQUISAR QUARTO POR TIPO  |");
        System.out.println("|----------------------------|");
        System.out.println("| Insira o tipo do quarto:   |");
        System.out.println("|____________________________|");
        System.out.print("> ");
        return sc.nextLine();
    }

    public String pesquisaReserva(){
        System.out.println("\n ________________________________");
        System.out.println("| PESQUISAR RESERVA POR HÓSPEDE  |");
        System.out.println("|--------------------------------|");
        System.out.println("| Insira o nome do hóspede   :   |");
        System.out.println("|________________________________|");
        System.out.print("> ");
        return sc.nextLine();
    }

    public void encerrar(){
        System.out.println("Sistema encerrado.");
    }
}

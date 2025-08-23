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
        System.out.println("| 3. Pesquisar resrva          |");
        System.out.println("|______________________________|");
        return TratamentoDeErros.Erros();
    }

    public void semCadastro(){
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
}

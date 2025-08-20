package br.com.sistemahotelaria.view;

import java.util.Scanner;

public class View {
    private static Scanner sc;

    public View(){
        sc = new Scanner(System.in);
    }

    public static String menu(){
        System.out.println("\n ______________________________");
        System.out.println("|             HOTEL            |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Gerenciar hóspedes        |");
        System.out.println("| 2. Gerenciar quartos         |");
        System.out.println("| 3. Gerenciar reservas        |");
        System.out.println("|______________________________|");
        System.out.print("> ");
        return sc.nextLine();
    }

    public String menuHospede(){
        System.out.println("\n ______________________________");
        System.out.println("|           HÓSPEDES           |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Cadastrar hóspede         |");
        System.out.println("| 2. Listar todos os hóspedes  |");
        System.out.println("| 3. Pesquisar hóspede         |");
        System.out.println("| 4. Editar dados              |");
        System.out.println("|______________________________|");
        System.out.print("> ");
        return sc.nextLine();
    }

    public String menuQuarto(){
        System.out.println("\n ______________________________");
        System.out.println("|            QUARTOS           |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Cadastrar quarto          |");
        System.out.println("| 2. Listar todos os quartos   |");
        System.out.println("| 3. Pesquisar quarto          |");
        System.out.println("|______________________________|");
        System.out.print("> ");
        return sc.nextLine();
    }

    public String menuReserva(){
        System.out.println("\n ______________________________");
        System.out.println("|           RESERVAS           |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Cadastrar reserva         |");
        System.out.println("| 2. Listar todas reserva      |");
        System.out.println("| 3. Pesquisar resrva          |");
        System.out.println("|______________________________|");
        System.out.print("> ");
        return sc.nextLine();
    }





}

package br.com.sistemahotelaria.view;

public class View {
    public static void menu(){
        System.out.println("\n ______________________________");
        System.out.println("|             HOTEL            |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Gerenciar hóspedes        |");
        System.out.println("| 2. Gerenciar quartos         |");
        System.out.println("| 3. Gerenciar reservas        |");
        System.out.println("|------------------------------|");
        System.out.println("| 0. Sair do sistema           |");
        System.out.println("|______________________________|");
    }

    public static void menuHospede(){
        System.out.println("\n ______________________________");
        System.out.println("|           HÓSPEDES           |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Cadastrar hóspede         |");
        System.out.println("| 2. Listar todos os hóspedes  |");
        System.out.println("| 3. Pesquisar hóspede         |");
        System.out.println("| 4. Editar dados              |");
        System.out.println("|______________________________|");
    }

    public static void menuQuarto(){
        System.out.println("\n ______________________________");
        System.out.println("|            QUARTOS           |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Cadastrar quarto          |");
        System.out.println("| 2. Listar todos os quartos   |");
        System.out.println("| 3. Pesquisar quarto          |");
        System.out.println("| 4. Editar dados              |");
        System.out.println("|______________________________|");
    }

    public static void menuReserva(){
        System.out.println("\n ______________________________");
        System.out.println("|           RESERVAS           |");
        System.out.println("|------------------------------|");
        System.out.println("| 1. Cadastrar reserva         |");
        System.out.println("| 2. Listar todas reserva      |");
        System.out.println("| 3. Pesquisar reserva         |");
        System.out.println("| 4. Cancelar reserva          |");
        System.out.println("| 5. Editar dados              |");
        System.out.println("|______________________________|");
    }

    public static void texto(String texto){
        System.out.println("\n" + texto);
    }

    public static void cabecalho(String texto){
        System.out.println(texto);
    }
}
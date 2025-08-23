package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.model.Hospede;
import java.util.Scanner;

public class CadastroHospede {

    public static Hospede cadastrar() {
        Scanner input = new Scanner(System.in);
        Hospede hosp = new Hospede();

        do {
            System.out.println("Insira o nome:");
        } while (!hosp.setNome(input.nextLine()));

        do {
            System.out.println("Insira os documentos:");
        } while (!hosp.setDocumento(input.nextLine()));

        do {
            System.out.println("Insira o telefone:");
        } while (!hosp.setTelefone(input.nextLine()));

        return hosp;
    }
}
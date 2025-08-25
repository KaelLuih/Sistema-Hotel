package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.view.View;

import java.util.Scanner;

public class CadastroHospede {

    public static Hospede cadastrar() {
        Scanner input = new Scanner(System.in);
        Hospede hosp = new Hospede();

        do {
            View.nome();
        } while (!hosp.setNome(input.nextLine()));

        do {
            View.documentos();
        } while (!hosp.setDocumento(input.nextLine()));

        do {
            View.telefone();
        } while (!hosp.setTelefone(input.nextLine()));

        return hosp;
    }
}
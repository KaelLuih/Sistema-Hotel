package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.view.View;

import java.util.Scanner;

public class Cadastro {
    private static final Scanner input = new Scanner(System.in);

    public static Hospede cadastroHospede() {
        Hospede hosp = new Hospede();

        do {
            View.textoCadastro("Nome");
        } while (!hosp.setNome(input.nextLine()));

        do {
            View.textoCadastro("Documentos");
        } while (!hosp.setDocumento(input.nextLine()));

        do {
            View.textoCadastro("Telefone");
        } while (!hosp.setTelefone(input.nextLine()));

        return hosp;
    }
}
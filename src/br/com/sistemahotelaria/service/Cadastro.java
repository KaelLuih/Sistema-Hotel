package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.model.Reserva;
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

    public static Quarto CadastroQuarto() {
        Quarto quar = new Quarto();

        do {
            View.textoCadastro("Numero");
        } while (!quar.setNumero(input.nextLine()));
        do {
            View.textoCadastro("Tipo");
        } while (!quar.setTipo(input.nextLine()));


        do {
            View.textoCadastro("Preço");
        }while (!quar.setPreco(input.nextLine()));

    return quar;
    }

    public static Reserva CadastroDeReserva(){
        Reserva res = new Reserva();

        do {
            View.textoCadastro("Quarto");
        }while(!res.setQuarto(input.nextLine()));
        do {
            View.textoCadastro("Ativo t/f");
        }while (!res.setAtiva(input.nextLine()));

        do {
            View.textoCadastro("Data de Entrada");
        }while (!res.setDataEntrada(input.nextLine()));

        do {
            View.textoCadastro("Data de Saida");
        }while(!res.setDataSaida(input.nextLine()));
        do {
            View.textoCadastro("Hospede");
        }while(!res.setHospede(input.nextLine()));



        return res;

    }

}
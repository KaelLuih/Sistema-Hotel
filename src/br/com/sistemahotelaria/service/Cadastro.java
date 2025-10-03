package br.com.sistemahotelaria.service;

import br.com.sistemahotelaria.errors.Erros;
import br.com.sistemahotelaria.model.Hospede;
import br.com.sistemahotelaria.model.Quarto;
import br.com.sistemahotelaria.view.View;

import static br.com.sistemahotelaria.errors.Erros.input;

public class Cadastro {

    public void hospede(){
        View.texto("\n _________________________");
        View.cabecalho("|    CADASTRAR HÓSPEDE    |");
        View.cabecalho("|_________________________|");
        View.texto("Nome:");
        String nome = input.nextLine();
        View.texto("Documento:");
        String documento = input.nextLine();
        View.texto("Telefone:");
        String telefone = input.nextLine();

        var hospede = new Hospede(nome, documento, telefone);
    }

    public void quarto(){
        View.texto("\n _________________________");
        View.cabecalho("|    CADASTRAR  QUARTO    |");
        View.cabecalho("|_________________________|");
        View.texto("Número:");
        int numero = Erros.entradaInt();
        View.texto("Tipo:");
        String tipo = input.nextLine();
        View.texto("Preço:");
        double preco = Erros.entradaDouble();

        var quarto = new Quarto(numero, tipo, preco);
    }

    public void reserva(){

    }
}
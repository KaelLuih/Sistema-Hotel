package br.com.sistemahotelaria.model;

public class Hospede extends Usuario {

    public Hospede(String nome, String documento, String telefone){
        super(nome, documento, telefone);
    }

    public Hospede() {
        super();
    }

    @Override
    public String toString(){
        return "\nNome: " + nome + "\nDocumento: " + documento + "\nTelefone: " + telefone;
    }
}

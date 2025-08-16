package br.com.sistemahotelaria.model;

public class Hospede {
    private String nome;
    private String documento;
    private String telefone;


    public Hospede(String nome, String documento, String telefone){
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "\nNome: " + nome + "\nDocumento: " + documento + "\nTelefone: " + telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

package br.com.sistemahotelaria.model;

public class Usuario {
    protected String nome;
    protected String documento;
    protected String telefone;

    public Usuario(String nome, String documento, String telefone){
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    public Usuario() {
        this.nome="";
        this.documento="";
        this.telefone="";
    }

    @Override
    public String toString(){
        return "\nNome: " + nome + "\nDocumento: " + documento + "\nTelefone: " + telefone;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome==null || nome.isBlank()){
            return false;
        }
        this.nome = nome;
        return true;
    }

    public String getDocumento() {
        return documento;
    }

    public boolean setDocumento(String documento) {
        this.documento = documento;
        return true;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean setTelefone(String telefone) {
        this.telefone = telefone;
        return true;
    }
}

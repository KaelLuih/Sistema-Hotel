package br.com.sistemahotelaria.model;

public class Quarto {
    private String numero;
    private String tipo;
    private double preco;


    public Quarto(){
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "\nNúmero: " + numero + "\nTipo: " + tipo + "\nPreço: " + preco;
    }

    public String getNumero() {
        return numero;
    }
    public boolean setNumero(String numero) {
        this.numero = numero;
        return true;
    }

    public String getTipo() {
        return tipo;
    }
    public boolean setTipo(String tipo) {
        this.tipo = tipo;
    return true;
    }

    public double getPreco() {
        return preco;
    }
    public boolean setPreco(double preco) {
        this.preco = preco;
        return true;
    }
}

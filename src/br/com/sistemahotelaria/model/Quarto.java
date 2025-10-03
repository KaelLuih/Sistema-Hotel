package br.com.sistemahotelaria.model;

public class Quarto {
    private int id;
    private int numero;
    private String tipo;
    private double preco;

    public Quarto(int id, int numero, String tipo, double preco) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
    }

    public Quarto(int numero, String tipo, double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "ID: " + id +
                "\nNúmero: " + numero +
                "\nTipo: " + tipo +
                "\nPreço: " + preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

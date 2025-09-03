package br.com.sistemahotelaria.model;

import java.time.LocalDate;

public class Reserva {
    private Hospede hospede;
    private Quarto quarto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private boolean ativa;

    public Reserva(Hospede hospede, Quarto quarto, LocalDate dataEntrada, LocalDate dataSaida, boolean ativa){
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.ativa = ativa;
    }

    public Reserva() {

    }

    @Override
    public String toString(){
        return "\nHospede: " + hospede + "\n\nQuarto: " + quarto + "\n\nData de check-in: " + dataEntrada + "\nData de check-out: " + dataSaida + "\nStatus: " + ativa;
    }

    public boolean printDataSaidaInvalida(LocalDate diaEntrada) {
        boolean invalida = this.dataSaida.isAfter(diaEntrada);
        if(!invalida){
            System.out.println("\nData inválida! Insira novamente.");
        }
        return invalida;
    }

    public Hospede getHospede() {
        return hospede;
    }
    public boolean setHospede(Hospede hospede) {
        this.hospede = hospede;
        return true;
    }

    public Quarto getQuarto() {
        return quarto;
    }
    public boolean setQuarto(Quarto quarto) {
        this.quarto = quarto;
        return true;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public boolean setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
        return true;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }
    public boolean setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
        return true;
    }

    public boolean getAtiva(){ return ativa; }

    public boolean setAtiva(boolean ativa){
        this.ativa = ativa;
        return true;
    }
}

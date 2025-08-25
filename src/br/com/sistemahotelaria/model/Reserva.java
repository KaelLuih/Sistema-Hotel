package br.com.sistemahotelaria.model;

import java.util.Date;

public class Reserva {
    private Hospede hospede;
    private Quarto quarto;
    private Date dataEntrada;
    private Date dataSaida;
    private boolean ativa;

    public Reserva(Hospede hospede, Quarto quarto, Date dataEntrada, Date dataSaida, boolean ativa){
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.ativa = ativa;
    }

    @Override
    public String toString(){
        return "\nHospede: " + hospede + "\nQuarto: " + quarto + "\nData de check-in: " + dataEntrada + "\nData de check-out: " + dataSaida + "\nStatus: " + ativa;
    }

    public Hospede getHospede() {
        return hospede;
    }
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(Date dataSaida) { this.dataSaida = dataSaida; }

    public boolean getAtiva(){ return ativa; }
    public void setAtiva(boolean ativa){ this.ativa = ativa; }
}

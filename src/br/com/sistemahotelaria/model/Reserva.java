package br.com.sistemahotelaria.model;

public class Reserva {
    private String hospede;
    private String quarto;
    private String dataEntrada;
    private String dataSaida;
    private String ativa;

    public Reserva(){
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

    public String getHospede() {
        return hospede;
    }
    public boolean setHospede(String hospede) {
        this.hospede = hospede;
        return true;
    }

    public String getQuarto() {
        return quarto;
    }
    public boolean setQuarto(String quarto) {
        this.quarto = quarto;
        return true;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }
    public boolean setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
        return true;
    }

    public String getDataSaida() {
        return dataSaida;
    }
    public boolean setDataSaida(String dataSaida) { this.dataSaida = dataSaida;
    return true;
    }

    public String getAtiva(){ return ativa; }
    public boolean setAtiva(String ativa){ this.ativa = ativa;
    return true;
    }
}

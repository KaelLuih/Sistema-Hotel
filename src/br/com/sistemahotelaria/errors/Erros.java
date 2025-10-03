package br.com.sistemahotelaria.errors;

import br.com.sistemahotelaria.view.View;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Erros {
    public static Scanner input = new Scanner(System.in);

    public static int entradaInt() {
        while (true) {
            View.texto("> ");
            String opcaoEscolhida = input.nextLine();
            try{
                return Integer.parseInt(opcaoEscolhida);
            }catch (NumberFormatException erro){
                View.texto("Entrada inválida!");
            }
        }
    }

    public static double entradaDouble() {
        double Escolha;
        while (true) {
            View.texto("> ");
            String opcaoEscolhida = input.nextLine();
            try{
                return Double.parseDouble(opcaoEscolhida);
            }catch (NumberFormatException erro){
                View.texto("Entrada inválida!");
            }
        }
    }

    public static LocalDate dataObrigatoria(){
        while (true){
            View.texto("> ");
            LocalDate agora = LocalDate.now();
            String dt = input.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try{
                LocalDate data = LocalDate.parse(dt, formatter);
                if(data.isAfter(agora) || data.isEqual(agora)){
                    return data;
                } else {
                    View.texto("Data inválida!");
                }
            } catch (DateTimeParseException e){
                View.texto("Entrada inválida!");
            }
        }
    }

    public static LocalDate dataOpcional(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
            LocalDate agora = LocalDate.now();
            String dt = input.nextLine().trim();
            if (dt.isEmpty()) return null;
            try {
                LocalDate data = LocalDate.parse(dt, formatter);
                if(data.isAfter(agora) || data.isEqual(agora)){
                    return data;
                } else {
                    View.texto("Data inválida!");
                }
            } catch (DateTimeParseException e) {
                View.texto("Entrada inválida!");
            }
        }
    }
}

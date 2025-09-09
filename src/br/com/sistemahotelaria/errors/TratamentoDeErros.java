package br.com.sistemahotelaria.errors;

import br.com.sistemahotelaria.view.View;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class TratamentoDeErros {
    static Scanner input = new Scanner(System.in);

    public static int Erros() {
        int Escolha;
        while (true) {
            View.opcao();
            String opcaoEscolhida = input.nextLine();

            try{
                Escolha = Integer.parseInt(opcaoEscolhida);
                return Escolha;
            }catch (NumberFormatException erro){
                View.erro();
            }
        }
    }

    public static double preco() {
        double Escolha;
        while (true) {
            View.opcao();
            String opcaoEscolhida = input.nextLine();

            try{
                Escolha = Double.parseDouble(opcaoEscolhida);
                return Escolha;
            }catch (NumberFormatException erro){
                View.erro();
            }
        }
    }

    public static double precoEdit(String preco) {
        double Escolha;
        while (true) {
            try{
                Escolha = Double.parseDouble(preco);
                return Escolha;
            }catch (NumberFormatException erro){
                View.erro();
            }
        }
    }

    public static LocalDate dataObrigatoria(){
        while (true){
            View.opcao();
            LocalDate agora = LocalDate.now();
            String dt = input.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try{
                LocalDate data = LocalDate.parse(dt, formatter);
                if(data.isAfter(agora) || data.isEqual(agora)){
                    return data;
                } else {
                    View.dataInvalida();
                }
            } catch (DateTimeParseException e){
                View.erro();
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
                    View.dataInvalida();
                }
            } catch (DateTimeParseException e) {
                View.erro();
            }
        }
    }
}

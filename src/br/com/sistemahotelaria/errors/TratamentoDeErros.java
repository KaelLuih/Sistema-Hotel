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

    public static LocalDate data(){
        while (true){
            System.out.print("\nInsira a data: ");
            String dt = input.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try{
                LocalDate data = LocalDate.parse(dt, formatter);
                return data;
            } catch (DateTimeParseException e){
                View.erro();
            }
        }
    }
}

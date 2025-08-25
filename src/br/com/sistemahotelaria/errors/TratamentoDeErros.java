package br.com.sistemahotelaria.errors;

import br.com.sistemahotelaria.view.View;

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
}

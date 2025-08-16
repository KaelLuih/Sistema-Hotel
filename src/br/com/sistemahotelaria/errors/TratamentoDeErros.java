package br.com.sistemahotelaria.errors;

import java.util.Scanner;

public class TratamentoDeErros {
    Scanner input = new Scanner(System.in);

    public int Erros() {
        int Escolha;
        while (true) {
            System.out.println("Digite a sua opção:");
            String opcaoEscolhida = input.nextLine();

            try{
                Escolha = Integer.parseInt(opcaoEscolhida);
                return Escolha;
            }catch (NumberFormatException erro){
                System.out.println("Erro:" + erro);
            }
        }

    }
}

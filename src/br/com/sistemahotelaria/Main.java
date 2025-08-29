package br.com.sistemahotelaria;

import br.com.sistemahotelaria.service.Service;
import br.com.sistemahotelaria.view.View;

public class Main {
    public static void main(String[] args) {

        View view = new View();
        boolean escolha = true;
        while(escolha){
            int opcao = view.menu();
            escolha = Service.gerenciar(opcao, view);
        }
    }
}

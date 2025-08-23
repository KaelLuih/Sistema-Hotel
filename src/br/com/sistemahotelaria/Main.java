package br.com.sistemahotelaria;

import br.com.sistemahotelaria.service.Service;
import br.com.sistemahotelaria.view.View;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

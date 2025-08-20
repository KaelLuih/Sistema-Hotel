package br.com.sistemahotelaria.service;
import br.com.sistemahotelaria.model.Hospede;

import java.util.Scanner;

public class CadastroHospede {


private static  Hospede hosp = new Hospede();

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Insira o nome");
        }while (!hosp.setNome(  input.nextLine()) );

        do {
            System.out.println("Insira os documentos:");
        }while (!hosp.setDocumento(input.nextLine()));

        do{
            System.out.println("Insira o telefone");
        }while (!hosp.setTelefone(input.nextLine()));

}



}
*
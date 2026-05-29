package br.ETS;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.Function;

public class exercicio2 {
    public static void main(String[] args) {
        int [] idade = new int[10];
        int [] peso = new int[10];

        double [] altura = new double[10];

        Scanner entrada = new Scanner(System.in);

        try{
            System.out.println("Digite a idade de 10 pessoas: ");

            for(int i = 0; i < 10; i++){
                System.out.println("Idade pessoa " + (i + 1) + "°:");
                idade[i] = Integer.parseInt(entrada.nextLine());}

            System.out.println("Digite o peso dessas 10 pessoas: ");

            for(int j = 0; j < 10; j++){
                System.out.println("Peso pessoa " + (j + 1) + "°:");
                peso[j] = Integer.parseInt(entrada.nextLine());
            }

            System.out.println("Digite a altura dessas 10 pessoas: ");

            for(int k = 0; k <10; k++){
                System.out.println("Altura pesssoa " + (k + 1) + "°:");
                altura[k] = Double.parseDouble(entrada.nextLine());
            }

            System.out.println("----- ANALISE DAS PESSOAS -----");

            int qtdIdosos = AnalisadorPessoas.analisarIdades(idade);
            System.out.println("ACIMA DE 50 ANOS: " + qtdIdosos);

            int abaixoPeso = AnalisadorPessoas.analisadorPeso(peso);
            System.out.println("ABAIXO DE 80KG: " + abaixoPeso);

            double altos = AnalisadorPessoas.analisadorAltura(altura);
            System.out.printf("ACIMA DE 1.60:%.0f " , altos);
        }catch(NumberFormatException e){
            System.out.println("ERRO: Insira apenas valores numéricos");
        }

        entrada.close();
    }
}

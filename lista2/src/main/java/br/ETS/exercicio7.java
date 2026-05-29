package br.ETS;


import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
      String resposta1, resposta2, resposta3;

      Scanner entrada = new Scanner(System.in);

        System.out.println("Questão 1- Qual palavra está escrita corretamente?");
        System.out.println("a - Karro");
        System.out.println("b - Carro");
        System.out.println("c - Carso");
        System.out.println("d - Baro");

        System.out.println("Insira sua resposta: ");
        resposta1 = entrada.nextLine();

        System.out.println("Questão 2- Qual palavra está escrita corretamente?");
        System.out.println("a - Mosca");
        System.out.println("b - Musca");
        System.out.println("c - Bosca");
        System.out.println("d - Barso");

        System.out.println("Insira sua resposta");
        resposta2 = entrada.nextLine();

        System.out.println("Questão 3- Qual palavra não está escrita corretamente?");
        System.out.println("a - Mosca ");
        System.out.println("b - Burro");
        System.out.println("c - Socorro");
        System.out.println("d - Barso");

        System.out.println("Insira sua resposta");
        resposta3 = entrada.nextLine();

        if (!resposta1.trim().isEmpty() && resposta1.matches("^[a-dA-D]$") &&
                !resposta2.trim().isEmpty() && resposta2.matches("^[a-dA-D]$") &&
                !resposta3.trim().isEmpty() && resposta3.matches("^[a-dA-D]$")) {

            AnalisadorRespostas.conferirGabaraito(resposta1, resposta2, resposta3);

        } else {
            System.out.println("\nERRO: Por favor, responda todas as questões usando apenas as letras A, B, C ou D.");
        }
    }
}
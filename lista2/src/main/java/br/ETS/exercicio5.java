package br.ETS;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        int qtdMinima, qtdMaxima, qtdAtual;

        Scanner entrada = new Scanner(System.in);

        try{
            System.out.println("Digite a quantidade atual de estoque: ");
            qtdAtual = Integer.parseInt(entrada.nextLine());

            System.out.println("Digite a quantidade mínima do estoque: ");
            qtdMinima = Integer.parseInt(entrada.nextLine());

            System.out.println("Digite a quantidade máxima do estoque: ");
            qtdMaxima =  Integer.parseInt(entrada.nextLine());

            calculadorEstoque.calcularExibirEstoque(qtdAtual, qtdMinima, qtdMaxima);
        }catch (NumberFormatException e){
            System.out.println("ERROR: Digite apenas números inteiros.");
        }

    }
}

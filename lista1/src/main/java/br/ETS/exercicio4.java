package br.ETS;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        int num, numAntecessor, numSucessor;

        Scanner entrada = new Scanner(System.in);

        try{
            System.out.print("Digite um número:");
            num = Integer.parseInt(entrada.nextLine());

            numAntecessor = num - 1;
            numSucessor = num + 1;

            System.out.println("O antecessor de  " + num + " é " + numAntecessor + " e seu sucessor é " + numSucessor);
        }catch (NumberFormatException e){
            System.out.println("Digite apenas números inteiros!!");
        }

    }
}

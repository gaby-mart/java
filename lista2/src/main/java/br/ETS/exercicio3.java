package br.ETS;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        int golsA, golsB;

        Scanner entrada = new Scanner(System.in);

        try{
            System.out.print("Insira quantidade de gols do Time A: ");
            golsA = Integer.parseInt(entrada.nextLine());

            System.out.print("Insira quantidade de gols do Time B: ");
            golsB = Integer.parseInt(entrada.nextLine());

            if(golsA>golsB){
                System.out.println("Time A venceu!!");
            } else if (golsA<golsB) {
                System.out.println("Time B venceu!!");
            }else{
                System.out.printf("EMPATE");
            }
        }catch (NumberFormatException e){
        System.out.println("Por favor, apenas insira números!!");
        }finally {
            entrada.close();
    }
    }
}

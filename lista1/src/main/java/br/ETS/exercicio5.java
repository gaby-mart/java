package br.ETS;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        int horas, minutos, segundos, totalSegundos;

        Scanner entrada = new Scanner(System.in);

        try{
            System.out.print("Digite a hora:");
            horas = Integer.parseInt(entrada.nextLine());

            System.out.print("Digite os minutos:");
            minutos = Integer.parseInt(entrada.nextLine());

            System.out.print("Digite os segundos:");
            segundos = Integer.parseInt(entrada.nextLine());

            horas = horas * 3600;
            minutos = minutos * 60;

            totalSegundos = horas + minutos + segundos;

            System.out.println("Essa é o horarios em segundos: " + totalSegundos);
        }catch (NumberFormatException e){
            System.out.println("Digite apenas número!");
        }finally {
            entrada.close();
        }
    }
}

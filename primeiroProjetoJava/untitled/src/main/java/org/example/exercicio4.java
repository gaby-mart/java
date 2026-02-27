package org.example;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = input.nextInt();
        int quadrado = num*num;
        int cubo = (num*num)*num;
        System.out.println("Resultado ao quadrado:" + quadrado);
        System.out.println("Resultado ao cubo:" + cubo);
    }
}

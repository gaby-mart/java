package org.example;

import java.util.Scanner;

public class exercico3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        float altura = input.nextFloat();
        System.out.println("Digite seu peso:");
        float peso = input.nextFloat();
        float imc = peso/(altura*altura);
        System.out.printf("Esse é o seu IMC ideal: %.2f", imc);
    }
}

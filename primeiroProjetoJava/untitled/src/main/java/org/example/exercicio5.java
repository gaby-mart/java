package org.example;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da base:");
        float base = input.nextInt();


        System.out.println("Digite o valor da altura");
        float altura = input.nextInt();

        float area = (base*altura)/2;
        System.out.printf("Essa é a área do triângulo %.2f", area);
    }
}

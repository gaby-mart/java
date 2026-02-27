package org.example;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celcius");
        float celcius = inputt.nextInt();
        float fahrenheith = (celcius*9/5)+32;
        System.out.println(fahrenheith);

    }
}

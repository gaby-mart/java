package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrnheit:");
        int fahrenheith = input.nextInt();
        int celcius = ((fahrenheith - 32) * 5)/9;
        System.out.println(celcius);
    }
}
package br.ETS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero;

        while (true) {
            try {
                System.out.print("Digite um número");
                numero = Integer.parseInt(entrada.nextLine());
                //numero = entrada.nextInt();

                if (numero < 20) {
                    continue;
                } else {
                    System.out.println("O número digitado é maior que 20.");
                    break;
                }

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Ops... você digitou caracteres inválidos, digite apenas número.");
            }
        }
        System.out.println(numero);
        }
}

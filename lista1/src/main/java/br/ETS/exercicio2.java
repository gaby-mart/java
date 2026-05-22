package br.ETS;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int num1, num2;

        int soma, sub, mult, div, resto, elevacao;

        Scanner entrada = new Scanner(System.in);
        try{
            System.out.println("-----CALCULADORA-----");

            System.out.print("Digite o primeiro número:");
            num1 = Integer.parseInt(entrada.nextLine());

            System.out.print("Digite o segundao número:");
            num2 = Integer.parseInt(entrada.nextLine());

            soma = num1 + num2;
            System.out.println("SOMA: " + soma);

            sub = num1 - num2;
            System.out.println("SUBTRAÇÃO: " + sub);

            mult = num1 * num2;
            System.out.println("MULTIPLICAÇÃO: " + mult );

            div = num1 / num2;
            System.out.println("DIVISÃO: " + div);

            elevacao =(int) Math.pow(num1, num2);

            resto = num1 % num2;

            System.out.println("ELEVAÇÃO: " +  elevacao);
            System.out.println("RESTO: " +  resto);
        }catch (NumberFormatException e){
            System.out.println("Digite apens números inteiros");
        }catch(ArithmeticException e){
            System.out.println("Não é possível dividir por zero!");
        }finally {
            entrada.close();
        }
    }
}

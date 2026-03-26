package br.ETS;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      /*  //Condicionais

        double media = 7.1;
        int faltas = 20;
        boolean postura = true;
        String situacao;

        if(media >= 5.0 && faltas < 25 && postura ==true ){
            situacao = "Aprovado";
        }
        else if (media < 5.0 && faltas < 25 && postura){
            situacao = "Recuperação";
        }
        else if (media >= 5.0 && faltas >= 25 && postura){
            situacao = "Sem Férias";
        }
        else if (media > 5.0 && faltas >= 25 && !postura){
            situacao = "Chamar os pais";
        }
        else {
            situacao = "Reprovado";
        }

        System.out.println(situacao);*/

        /*int a = 11;
        int b = 11;

        if (a>10){
            System.out.println("a é maior que 10.");
        }
        if (b>20){
            System.out.println("b é maior que 20.");
        }
        else{
            System.out.println("b é menor ou igual a 20.");
        }*/
       /*     int x=3, y=4, z=5;

        System.out.println(x == z - y && z != y -x || y != z - x);*/

        //Atividade

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }

        if (numero % 2 == 0 && numero % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if (numero % 5 == 0){
            System.out.println("Buzz");
        }
        else if (numero % 2 == 0) {
            System.out.println("Fizz");
        }
        else{
            System.out.println("ERRO!");
        }

    }
    }
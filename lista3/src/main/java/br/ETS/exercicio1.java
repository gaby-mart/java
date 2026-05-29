package br.ETS;
import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        Scanner entrada = new Scanner(System.in);

        try{
            System.out.println("Digite 10 números inteiros: ");

            for (int i = 0; i <10; i++){
                System.out.println("Número" + (i+1) + ":");
                numeros[i] = Integer.parseInt(entrada.nextLine());
            }

        }catch(NumberFormatException e){
            System.out.println("ERRO: Digite apenas número inteiros");
        }

        while (true){
            System.out.println("\n--- O QUE VOCÊ DESEJA SABER? ---");
            System.out.println("a. Quantos números pares?");
            System.out.println("b. Quantos números ímpares?");
            System.out.println("c. Quantos negativos?");
            System.out.println("d. Quantos positivos?");
            System.out.println("e. Sair do programa");
            System.out.print("Escolha uma opção: ");

           char opcao = entrada.next().toLowerCase().charAt(0);

           switch (opcao){
               case 'a':
                   int pares = AnalisadorNumeros.contarPares(numeros);
                   System.out.println("Quantidade Pares: " + pares);
                   break;

               case 'b':
                   int impares = AnalisadorNumeros.contarImpares(numeros);
                   System.out.println("Quantidades Impares: " + impares);
                   break;

               case 'c':
                   int negativos = AnalisadorNumeros.contarNegativo(numeros);
                   System.out.println("Quantidade Negativos: " + negativos);
                   break;

               case 'd':
                   int positivos = AnalisadorNumeros.contadorPositivos(numeros);
                   System.out.println("Quantidade Positivos: " + positivos);
                   break;

               case 'e':
                   System.out.println("Saindo do programa....");
                   entrada.close();
                   System.exit(0); // Encerra o programa
                   break;

               default:
                   System.out.println("Opção Inválida, tente novamente.");
                   break;
           }
        }

    }
}
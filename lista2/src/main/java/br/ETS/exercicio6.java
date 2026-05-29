package br.ETS;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
            int numeroUsuario;

            Scanner entrada = new Scanner(System.in);

            try{
                System.out.println("------- ADIVINHADOR NÚMERO DA SORTE ------");

                System.out.println("Digite um número de 0 a 100: ");
                numeroUsuario = Integer.parseInt(entrada.nextLine());

                Sorteio.sorteador(numeroUsuario);

            } catch (NumberFormatException e) {
                System.out.println("ERRO: Insira apenas valores inteiros!");
            }
    }
}


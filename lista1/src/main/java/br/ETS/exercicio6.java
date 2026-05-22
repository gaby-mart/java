package br.ETS;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        double nota1, nota2, peso1 = 4, peso2 = 6, media;
        String validacao;

        Scanner entrada = new Scanner(System.in);
        try{
            System.out.print("Digite a nota 1: ");
            validacao = entrada.nextLine().trim().replace(",", ".");
            nota1 = Double.parseDouble(validacao);

            System.out.print("Digite a nota 2: ");
            validacao = entrada.nextLine().trim().replace(",", ".");
            nota2 = Double.parseDouble(validacao);

            media = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);

            System.out.printf("MÉDIA FINAL: %.2f\n", media);

        } catch (NumberFormatException e){
            System.out.println("Erro: Insira apenas números válidos!");
        } finally {
            entrada.close();
        }
    }
}


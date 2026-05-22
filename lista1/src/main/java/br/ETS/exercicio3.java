package br.ETS;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        double valorCompra, valorVenda, imposto, representante;

        Scanner entrada = new Scanner(System.in);

        try{
        System.out.print("Digite o valor da compra:");
        String validacaoVirgula = entrada.nextLine().trim().replace(",", ".");
        valorCompra = Double.parseDouble(validacaoVirgula);

        representante = valorCompra * 0.20;
        imposto = valorCompra + 0.30;
        valorVenda = valorCompra + representante + imposto;

            System.out.println("VALOR INICIAL: " + valorCompra);
            System.out.println("VALOR IMPOSTORS: " + imposto);
            System.out.println("COMISSÃO: " + representante);
            System.out.println("VALOR FINAL: " + valorVenda);

        }catch(NumberFormatException e){
            System.out.println("Por favor, apenas insira números!!");
        }finally {
            entrada.close();
        }

    }
}

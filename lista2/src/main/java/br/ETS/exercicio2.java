package br.ETS;

import java.util.Scanner;
import java.util.function.Function;

public class exercicio2 {
    public static void main(String[] args) {
        double valorProduto, valorCompra, desconto = 0.10;

        int qtdProdutos;

        Scanner entrada = new Scanner(System.in);

        try{
            System.out.println("------ CAIXA ROBLOTIONS ------");

            System.out.print("Digite a quantidade de produtos: ");
            qtdProdutos = Integer.parseInt(entrada.nextLine());

            System.out.println("Digite o valor do produto: R$");
            String validacao = entrada.nextLine().trim().replace(",", ".");
            valorProduto = Double.parseDouble(validacao);

            if(qtdProdutos <= 12){

                valorCompra = valorProduto * qtdProdutos;

                System.out.println("----------- NOTA FISCAL -------");
                System.out.println("VALOR PRODUTO: RS"+ valorProduto);
                System.out.println("QUANTIDADE: " + qtdProdutos);
                System.out.println("VALOR DESCONTO: R$0.00");
                System.out.println("VALOR FINAL: R$" + valorCompra);
            } else{
                double valorDescinto = valorProduto * desconto;
                valorCompra = (valorProduto * qtdProdutos)-valorDescinto;

                System.out.println("----------- NOTA FISCAL -------");
                System.out.println("VALOR PRODUTO: RS"+ valorProduto);
                System.out.println("QUANTIDADE: " + qtdProdutos);
                System.out.println("VALOR DESCONTO:" + valorDescinto);
                System.out.println("VALOR FINAL: R$" + valorCompra);
            }
        }catch (NumberFormatException e){
            System.out.println("Por favor, apenas insira números!!");
        }finally {
            entrada.close();
        }
    }
}

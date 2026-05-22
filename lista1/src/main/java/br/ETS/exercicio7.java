package br.ETS;

import java.util.Scanner;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.DateTimeException;
import java.util.Locale;

public class exercicio7 {
    public static void main(String[] args) {
        String nomeVendedor, nomeMes;
        int carros, mes;
        double salario = 1500.00, comissao = 350.00;
        double valorVendas, salarioTotal;

        Scanner entrada = new Scanner(System.in);

        System.out.println("-----FOLHA PAGAMENTO-----");
        System.out.print("Insira o nome do funcionário: ");
        nomeVendedor = entrada.nextLine();

        if (!nomeVendedor.trim().isEmpty() && nomeVendedor.matches("^[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ ]+$")) {
            try {
                System.out.print("O mês referente a esta folha (1 a 12): ");
                mes = Integer.parseInt(entrada.nextLine().trim());

                Month mesPagamento = Month.of(mes);

                nomeMes = mesPagamento.getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

                System.out.print("Insira a quantidade de carros vendido por " + nomeVendedor + ": ");
                carros = Integer.parseInt(entrada.nextLine().trim());

                System.out.print("Insira o valor total das vendas de " + nomeVendedor + ": R$ ");
                String validacao = entrada.nextLine().trim().replace(",", ".");
                valorVendas = Double.parseDouble(validacao);

                salarioTotal = salario + (carros * comissao) + (valorVendas * 0.05);

                System.out.println("\n=================================");
                System.out.println("   DEMONSTRATIVO de PAGAMENTO    ");
                System.out.println("=================================");
                System.out.println(" Funcionário: " + nomeVendedor);
                System.out.println(" Mês de Ref.: " + nomeMes.toUpperCase());
                System.out.println(" Carros Vend.: " + carros);
                System.out.printf(" Vol. Vendas : R$ %.2f\n", valorVendas);
                System.out.println("---------------------------------");
                System.out.printf(" Salário Base: R$ %.2f\n", salario);
                System.out.printf(" Comissões   : R$ %.2f\n", (carros * comissao));
                System.out.printf(" SALÁRIO LIQ.: R$ %.2f\n", salarioTotal);
                System.out.println("=================================");

            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números válidos para os cálculos!");
            } catch (DateTimeException e) {
                System.out.println("Erro: Mês inválido! Digite um valor de 1 a 12.");
            } finally {
                entrada.close();
            }
        } else {
            System.out.println("Erro: Nome do funcionário inválido!");
            entrada.close();
        }
    }
}
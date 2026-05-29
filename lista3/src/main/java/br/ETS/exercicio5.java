package br.ETS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        int saldo;
        List<Integer> vetorSaldos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        while(true){
            System.out.println("\n----- CALCULADORA DE RISCOS -----");
            System.out.println("Deseja inserir um novo saldo: 1-Sim ou 2-Não");
            int opcao = Integer.parseInt(entrada.nextLine());

            if(opcao == 1 ){
                System.out.println("Insira um saldo: ");
                saldo = Integer.parseInt(entrada.nextLine());
                vetorSaldos.add(saldo);

            } else if(opcao == 2){
                System.out.println("\n------ STATUS BANCÁRIOS DA INSTITUIÇÃO -------");

                int qtdSaldos = vetorSaldos.size();

                System.out.println("----- ANÁLISE DE SALDOS -----");

                // Chamadas diretas dos métodos da sua biblioteca utilitária
                CalculadorRiscos.qtdSaldosPositivos(vetorSaldos, qtdSaldos);
                CalculadorRiscos.qtdSaldosNegativos(vetorSaldos, qtdSaldos);
                CalculadorRiscos.statusBanco(vetorSaldos, qtdSaldos);

                entrada.close();
                System.exit(0);
                break;

            } else {
                System.out.println("Opção inválida! Escolha 1 ou 2.");
            }
        }
    }
}
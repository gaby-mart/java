package br.ETS;

import java.util.List;

public class CalculadorRiscos {
    public static void qtdSaldosPositivos(List<Integer> vetorSaldos, int qtdSaldos){
        if (qtdSaldos == 0) return;

        int contador = 0;
        for(int saldo : vetorSaldos){
            if(saldo > 0){
                contador++;
            }
        }

        System.out.println("QUANTIDADE DE SALDOS POSITIVOS: " + contador);

        double porcentagemPositivo = ((double) contador / qtdSaldos) * 100;
        System.out.printf("Porcentagem de saldos positivos: %.2f%%\n", porcentagemPositivo);
    }

    public static void qtdSaldosNegativos(List<Integer> vetorSaldos, int qtdSaldos){
        if (qtdSaldos == 0) return;

        int contador = 0;
        for(int saldo : vetorSaldos){
            if(saldo < 0){
                contador++;
            }
        }

        System.out.println("QUANTIDADE DE SALDOS NEGATIVOS: " + contador);

        double porcentagemNegativa = ((double) contador / qtdSaldos) * 100;
        System.out.printf("Porcentagem de saldos negativos: %.2f%%\n", porcentagemNegativa);
    }

    public static void statusBanco(List<Integer> vetorSaldos, int qtdSaldos){
        if (qtdSaldos == 0) return;

        int qtdNegativa = 0;


        for(int saldo : vetorSaldos){
            if(saldo < 0){
                qtdNegativa++;
            }
        }


        if(qtdNegativa > (qtdSaldos / 2)){
            System.out.println("STATUS BANCO: Crítico ⚠️");
        } else {
            System.out.println("STATUS BANCO: Estável ✅");
        }
    }
}
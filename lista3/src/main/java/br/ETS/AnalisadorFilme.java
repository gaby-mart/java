package br.ETS;

import java.util.List;

public class AnalisadorFilme {
    public static double qtsOtimo(List<Integer> notas, int qtdFas){
        int contador = 0;

        for(int nota : notas){
            if(nota == 1){
                contador++;
            }
        }

        double otimo = ((double)contador/ qtdFas)*100;
        return otimo;
    }

    public static double qtdBom(List<Integer> notas, int qtdFas){
        int contador = 0;

        for(int nota : notas){
            if(nota == 2){
                contador++;
            }
        }

        double bom = ((double)contador/ qtdFas)*100;
        return bom;
    }

    public static double qtdRuim(List<Integer> notas, int qtdFas){
        int contador = 0;

        for(int nota : notas){
            if(nota == 3){
                contador++;
            }
        }

        double ruim = ((double)contador/ qtdFas)*100;
        return ruim;
    }

    public static double media(List<Integer> notas, int qtdFas){
        int soma = 0;

        for(int nota : notas){
            soma += nota;
        }
        double media = ((double) soma / qtdFas);
        return media;
    }

}

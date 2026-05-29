package br.ETS;

public class AnalisadorPessoas {
    public static int analisarIdades(int[] idade){
        int contador = 0;

        for(int i : idade){
            if(i > 50){
                contador++;
            }
        }return contador;
    }

    public static int analisadorPeso(int[] peso){
        int contador = 0;

        for(int i : peso){
            if(i < 80){
                contador++;
            }
        }return contador;
    }

    public static double analisadorAltura(double[] altura){
        int contador = 0;

        for (double i : altura){
            if(i > 1.60){
                contador++;
            }
        }return contador;
    }
}

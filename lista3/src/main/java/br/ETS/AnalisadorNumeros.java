package br.ETS;

public class AnalisadorNumeros {

    public static int contarPares(int[] numeros){
        int contador = 0;
                for (int num : numeros){
                    if(num % 2 == 0){
                        contador++;
                    }
                }
                return contador;
    }

    public static int contarImpares(int[] numeros){
        int contador = 0;

        for(int num : numeros){
            if(num % 2 != 0){
                contador++;
            }
        }
        return contador;
    }

    public static int contarNegativo(int[] numeros){
        int contador = 0;

        for(int num : numeros){
            if(num < 0){
                contador++;
            }
        }return contador;
    }

    public static int contadorPositivos(int[] numeros){
        int contador = 0;

        for(int num : numeros){
            if(num > 0){
                contador++;
            }
        }return contador;
    }


}

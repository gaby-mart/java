package br.ETS;

import java.util.Random;

public class Sorteio {
    public static void sorteador(int numUsuario){
        Random num = new Random();

        int numeroSorteado = num.nextInt(101);

        if(numUsuario == numeroSorteado){
            System.out.println("Acertou!!");
        }else{
            System.out.println("Você Errou!!");
        }
    }
}

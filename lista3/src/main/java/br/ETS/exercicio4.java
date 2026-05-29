package br.ETS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class exercicio4 {
    public static void main(String[] args){
        int incremento, num;

        List<Integer> vetor = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite um incremento: ");
        incremento = Integer.parseInt(entrada.nextLine());

        for(int i = 0; i <= num; i += incremento){
            vetor.add(i);
        }

        System.out.println("Vetor gerado: " + vetor);
        entrada.close();
    }
}

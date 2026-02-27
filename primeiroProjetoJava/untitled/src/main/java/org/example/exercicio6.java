package org.example;

public class exercicio6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 12;
        int c = -13;

        float delta = (b*b)-4*(a*c);
        double baskhara = ((-b)+ Math.sqrt(delta))/(2*a);
        System.out.printf("Este é o resultado da formula de Baskhara:" + baskhara);

    }
}

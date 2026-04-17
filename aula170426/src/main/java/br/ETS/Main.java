package br.ETS;

public class Main{

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    int multiplicacao = i * j;
                    System.out.printf(i + " * " + j + " = " + multiplicacao + "\t");
                }
            System.out.println();
            }
    }
}
package org.example;

public class desafio {
    public static void main(String[] args) {
      double primeiroParentese = Math.pow(-3.0/4.0,-2);
      double segundoParentese = Math.pow(3.0, -1)/4;
      double parteDeCima = 3 * primeiroParentese + 6 * segundoParentese - 4;

      double terceiroParentese = Math.pow(-3.0/4.0, -1);
      double parteDeBaixo = 7 * terceiroParentese + 2;

      double parcial = parteDeCima/parteDeBaixo;
      double potencia = Math.pow(parcial, -1);
      double resultado = potencia + 4;
        System.out.printf("resultado="+ resultado);



    }
}

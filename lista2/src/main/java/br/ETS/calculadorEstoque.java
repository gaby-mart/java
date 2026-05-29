package br.ETS;

public class calculadorEstoque {
    public static void calcularExibirEstoque(int qtdAtual, int qtdMin, int qtdMax){

         int qtdMed = (qtdMin + qtdMax)/2;
         String status;

         if(qtdAtual >= qtdMed){
             status = "Estoque Cheio";

         } else{
             status = "Estoque Vazio";
         }

        System.out.println("------- ESTOMAQ ------");
        System.out.println("QUANTIDADE ATUAL: " + qtdAtual);
        System.out.println("QUANTIDADE MÁXIMA: " + qtdMax);
        System.out.println("QUANTIDADE MÍNIMA: " + qtdMin);

        if(status == "Estoque Cheio"){
            System.out.println("STATUS: " + status);
            System.out.println("NÃO REALIZAR COMPRA!");
        } else if (status == "Estoque Vazio") {
            System.out.println("STATUS: " + status);
            System.out.println("REALIZAR COMPRA!");
        }
    }
}

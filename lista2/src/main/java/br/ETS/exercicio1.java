package br.ETS;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int idade;

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("------CALCULADORA FAIXA ETÁRIA-----");

            System.out.println("Digite a idade: ");
            idade = Integer.parseInt(entrada.nextLine());

            if(idade == 0 || idade <= 14){
                System.out.println("Faixa Etária: Criança");
            } else if (idade <= 17) {
                System.out.println("Faixa Etária: Adolescente");
            }else if (idade <= 30){
                System.out.println("Faixa Etária: Adulto Jovem");
            }else{
                System.out.println("Faixa Etária: Adulto");
            }

        } catch (NumberFormatException e) {
            System.out.println("ERRO: Insisra apenas valores numéricos!");
        }finally {
            entrada.close();
        }
    }
}
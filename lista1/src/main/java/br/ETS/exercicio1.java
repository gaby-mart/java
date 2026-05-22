package br.ETS;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String  nome, sobrenome, escolaridade, cnh;
        String escolaridadeValida = "Ensino medio";
        String dataCompleta;

        int dia, mes, ano;

        double pretencaoSalarial;

        System.out.println("Bem-vindo ao Bosch carreiras!");

        System.out.print("Digite seu primeiro nome:");
        nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome:");
        sobrenome = entrada.nextLine();

        if (!nome.trim().isEmpty() ||
                !nome.matches("^[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ ]+$")
        ) {
            System.out.print("Digite seu grau de escolaridade:");
            escolaridade = entrada.nextLine();

            if (!escolaridade.trim().isEmpty() &&
                    escolaridade.matches("^[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÊÍÏÓÔÕÖÚÇÑ ]+$") &&
                    escolaridade.contains(" ")
            ){
                System.out.print("Possui CNH tipo:");
                cnh = entrada.nextLine();

                if(cnh.equalsIgnoreCase("B")){
                    try {
                        System.out.print("Digite seu dia de nascimento:");
                        dia = Integer.parseInt(entrada.nextLine());

                        System.out.print("Digite o mês do seu nascimento:");
                        mes = Integer.parseInt(entrada.nextLine());

                        System.out.print("Digite seu ano de nascimento:");
                        ano = Integer.parseInt(entrada.nextLine());

                        dataCompleta  = dia + "/" + mes + "/" + ano;

                        System.out.print("Qual a sua pretenção salarial:");
                        pretencaoSalarial = entrada.nextDouble();

                        System.out.println("\n=============================================");
                        System.out.println("      FICHA DE CANDIDATO - BOSCH CARREIRAS   ");
                        System.out.println("=============================================");
                        System.out.printf(" Nome Completo: %s %s\n", nome, sobrenome);
                        System.out.printf(" Data de Nasc.: %s\n", dataCompleta);
                        System.out.printf(" Escolaridade : %s\n", escolaridade);
                        System.out.printf(" Possui CNH: %s\n", cnh);
                        System.out.printf(" Pret. Salarial: R$ %.2f\n", pretencaoSalarial);
                        System.out.println("=============================================");
                        System.out.println("  Inscrição realizada com sucesso! Boa sorte!");
                        System.out.println("=============================================");

                    }catch (NumberFormatException e){
                        System.out.println("Erro: digite apenas números inteiros!");
                    }
                }else{
                    System.out.println("Para este cargo é necessário no mínimo CNH do tipo B.");
                }
            }else{
                System.out.println("Por favor, insira apenas letras.");
            }
        }else {
            System.out.println("Por favor, insitra apenas letras.");
        }

        entrada.close();
    }
}
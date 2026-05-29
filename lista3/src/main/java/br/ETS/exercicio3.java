package br.ETS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        int qtdfas = 0;
        int opcao;
        int nota;

        List<Integer> notas = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

            while (true){
                    System.out.println("----- AVALIADOR DE FILMES -----");
                    System.out.println("Deseja avaliar o novo filme: 1-Sim ou 2-Não");
                    opcao = Integer.parseInt(entrada.nextLine());

                    if (opcao == 1 || opcao == 2){
                        if(opcao == 1){
                            qtdfas++;

                            System.out.println("Insira o número correspondente a sau avaliação: ");
                            System.out.println("1 - Ótimo");
                            System.out.println("2- Bom");
                            System.out.println("3- Ruim");
                            nota = Integer.parseInt(entrada.nextLine());
                            notas.add(nota);

                        } else if (opcao == 2) {
                            System.out.println("Analizando os dados da pesquisa....");

                            System.out.println("----- ANALISE DE RESPOSTA -----");

                            double porcentagemOtimo = AnalisadorFilme.qtsOtimo(notas, qtdfas);
                            double porcentagemBom = AnalisadorFilme.qtdBom(notas, qtdfas);
                            double porcentagemRuim = AnalisadorFilme.qtdRuim(notas, qtdfas);
                            double mediaNotas = AnalisadorFilme.media(notas, qtdfas);

                            System.out.printf("Ótimo: %.2f%%\n", porcentagemOtimo);
                            System.out.printf("Bom: %.2f%%\n", porcentagemBom);
                            System.out.printf("Ruim: %.2f%%\n", porcentagemRuim);
                            System.out.printf("Média Notas:%.0f%%\n ", mediaNotas);
                            System.out.println("Total de participantes: " + qtdfas);

                            entrada.close();
                            System.exit(0); // Encerra o programa
                            break;
                        }
                    }
                    else{
                       System.out.println("Valor Inválido!");
            }
        }
    }
}

package br.ETS;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        int destinoViagem, servicoIncluso;
        double valorFinal = 0.00, valorInicial = 3000.00, taxaAlimentacao = 0.00;

        Scanner entrada = new Scanner(System.in);

        // INSTÂNCIANDO A CLASSE: Criamos o objeto que sabe fazer contas
        CalculadoraViagens calculadora = new CalculadoraViagens();

        try {
            System.out.println("------VIAGENS MARTINS------");
            System.out.println("------DESTINO DESEJADO------");
            System.out.println("1- Maceió");
            System.out.println("2- Porto de Galinhas");
            System.out.println("Insira o destino desejado:");
            destinoViagem = Integer.parseInt(entrada.nextLine());

            // Validação simples de destino
            if (destinoViagem != 1 && destinoViagem != 2) {
                System.out.println("Destino inválido.");
                return; // Para a execução aqui
            }

            System.out.println("------SERVIÇOS EXTRAS------");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            System.out.println("Deseja incluir refeições extras? (Almoço e Jantar) :");
            servicoIncluso = Integer.parseInt(entrada.nextLine());

            // CHAMANDO O MÉTODO: A mágica acontece aqui
            taxaAlimentacao = calculadora.CalcularTaxaAlimentacao(destinoViagem, servicoIncluso, valorInicial);
            valorFinal = valorInicial + taxaAlimentacao;

            System.out.println("------ PACOTE DOS SONHOS -------");
            System.out.println("TAXA INICIAL: R$" + valorInicial);
            System.out.println("TAXA ALIMENTAÇÃO: R$" + taxaAlimentacao );
            System.out.println("VALOR FINAL: R$" + valorFinal);

        } catch (NumberFormatException e) {
            System.out.println("ERRO: Digite apenas números");
        }
    }
}

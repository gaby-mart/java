package br.ETS;

import java.util.Scanner;

public class atiividadeTrem {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int velocidadeA;
        int velocidadeB;
        int posicaoA;
        int posicaoB;
        int desicao;

        double posicaoFinal;
        double tempoColisaoHoras;
        double tempoColisao;

        int hora, minutos, segundos;
        int saidaHora = 17;
        int horaFinal;

        while (true) {

            try {

                System.out.print("Digite a posição inicial do trem A: ");
                posicaoA = Integer.parseInt(entrada.nextLine());

                System.out.print("Digite a posição inicial do trem B: ");
                posicaoB = Integer.parseInt(entrada.nextLine());

                System.out.print("Digite a velocidade do trem A: ");
                velocidadeA = Integer.parseInt(entrada.nextLine());

                System.out.print("Digite a velocidade do trem B (negativa): ");
                velocidadeB = Integer.parseInt(entrada.nextLine());

                if (posicaoA < 0 || posicaoA > 10000 ||
                        posicaoB < 0 || posicaoB > 10000) {

                    System.out.println("Posição inválida!");
                }

                if (velocidadeA < 0 || velocidadeA > 300 ||
                        velocidadeB > 0 || velocidadeB < -300) {

                    System.out.println("Velocidade inválida!");
                }

                if (velocidadeA == velocidadeB || posicaoA >= posicaoB) {

                    System.out.println("Os trens não irão se colidir.");
                }

                tempoColisaoHoras =
                        (double)(posicaoB - posicaoA) /
                                (velocidadeA - velocidadeB);

                if (tempoColisaoHoras < 0) {

                    System.out.println("Os trens não irão se colidir.");
                    continue;
                }

                posicaoFinal =
                        posicaoA + velocidadeA * tempoColisaoHoras;

                tempoColisao = tempoColisaoHoras * 3600;

                hora = (int) tempoColisaoHoras;

                minutos = (int) ((tempoColisaoHoras - hora) * 60);

                segundos =
                        (int) ((((tempoColisaoHoras - hora) * 60) - minutos) * 60);

                horaFinal = saidaHora + hora;

                System.out.println("\n=== RESULTADO ===");

                System.out.println("Tempo de colisão: "
                        + tempoColisao + " segundos");

                System.out.println("Posição da colisão: "
                        + posicaoFinal + " km");

                System.out.printf("Horário da colisão: %02d:%02d:%02d%n",
                        horaFinal % 24, minutos, segundos);

            } catch (NumberFormatException e) {

                System.out.println("Erro: digite apenas números!");
            }

            System.out.println("\nDeseja realizar outro cálculo?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            desicao = Integer.parseInt(entrada.nextLine());

            if (desicao == 2) {

                System.out.println("Saindo do programa...");
                break;
            }
        }

        entrada.close();
    }
}

        //

        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⡾⠛⠉⠛⠿⣦⣐⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⠿⠛⠻⠿⠟⠋⠀⠀⠀⠀⠀⠈⠙⠛⢷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⢾⣟⡿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⣀⣄⠀⠀⠀⠀⠀⠀⠹⣷⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣾⡇⠀⠀⠀⠀⣠⣶⠻⢿⣤⣶⠟⠛⠛⢷⣄⣀⡀⣀⠀⠀⢻⣷⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣾⣷⣤⣀⣴⣾⠋⠀⠀⠀⠀⠀⢲⣄⡀⠀⠙⠛⠛⠛⣿⣦⣀⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡀⣼⠟⠙⡉⠁⠀⠀⠀⠀⠀⠈⠙⠻⣦⡀⠀⢾⣷⡿⠋⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⣠⣴⣶⢶⣦⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⡟⠀⣰⡇⠀⠀⣸⠇⠀⢠⣴⣶⣤⡌⠀⠀⣾⡿⣧⡀⠀⣸⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⣼⡿⠃⠀⠀⢿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⢿⡇⠀⣸⡟⠀⠀⠘⠛⠿⣿⠀⠀⠀⣻⣿⣟⣿⣤⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⣾⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢿⡟⠀⠀⠈⠀⣼⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣯⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⢸⣇⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⢸⡇⠀⠀⣀⠘⠙⢷⠆⠀⠀⠀⠀⠀⠀⠀⠀⠛⠁⠀⠈⠙⢿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠘⣿⡀⠀⠀⠀⢻⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣼⣇⠀⣼⣿⣦⣤⣄⣠⣤⣤⣴⣶⣶⠄⠀⠀⠀⠀⠀⠀⠀⣸⣿⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⢀⣀⣀⣽⣷⣤⣀⠀⠀⠻⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⡀⠘⠻⢦⣄⣈⠉⣩⣥⣴⠿⡿⠀⠀⠀⠀⠀⣀⣤⣶⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⢰⣿⠛⠋⠉⠉⠉⠙⠛⠿⣦⣄⠈⢻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢻⣿⣄⠀⠀⢹⣽⣟⠋⠁⠀⠀⠁⠀⠀⠀⣠⣾⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⡄⠀⢹⣿⣄⣀⣀⠀⡀⢀⣀⣀⣀⣀⣀⣀⣿⣿⣷⣄⡀⠈⠁⠀⠀⠀⠀⠀⠀⣠⣾⡟⠛⢿⣿⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⣸⣿⠿⠿⠟⠛⠿⠿⢶⣦⣼⣿⠀⠀⠀⣿⣿⡻⣟⠿⡿⢿⡻⣟⢿⣛⣟⡻⢿⣿⣿⠙⠻⣷⡶⠦⠤⠀⠀⣶⣿⠟⠋⠀⠀⣼⣿⡿⣿⣷⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣆⠀⢰⣿⡷⣙⢮⣻⢱⣏⡵⣎⣗⣺⠲⣝⣣⢟⣿⡆⠀⠙⠛⠿⠶⠿⠛⠋⠁⠀⠀⣠⣾⡿⣏⠷⣏⡾⣽⣻⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀
⠘⣿⣦⣤⣴⣶⣶⣤⣤⣄⣀⣸⡿⢠⣿⣿⣏⡽⣚⣥⣏⢶⣝⡶⢮⣵⡟⡼⣜⠮⡿⣿⣦⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⡿⣏⡳⣭⢻⢼⡹⢧⣛⡾⣽⢿⣷⣄⠀⠀⠀⠀⠀⠀
⠀⢿⡏⠁⠀⠀⠀⠀⠈⠉⢻⣿⠁⢀⣿⣿⢾⣹⢟⣮⡽⣏⣾⣿⣿⣿⣏⠷⣎⢯⡵⣻⡏⠀⠀⠀⠀⣰⣿⣿⢿⡛⣧⡝⣶⡹⣜⢧⣫⢗⣫⢼⡹⢞⡯⣟⣿⣷⣄⠀⠀⠀⠀
⠀⠘⢿⣦⣤⣤⣤⣤⣤⣤⣾⠿⣠⣾⣿⣿⣾⣷⣿⣾⡿⠿⠿⠛⠛⣿⣎⢷⣹⣎⢷⣿⠇⠀⠀⠀⠀⣿⡿⡜⣶⡹⡖⡽⡲⣝⠮⣞⢲⡝⣎⠷⣹⢎⢷⡹⣞⡽⣿⣷⡀⠀⠀
⠀⠀⠀⠙⠿⣿⣭⣭⣭⣭⣴⡾⠟⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⢐⣿⣟⢮⣳⢞⣻⣿⠀⠀⠀⠀⢰⣿⢷⡹⣲⣝⡱⢯⠵⣿⣿⣼⣓⡮⣝⠾⣱⢫⡞⡵⢮⡹⣟⡿⣿⡄⠀
⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣎⢧⡝⣮⢿⡟⠀⠀⠀⠀⢸⣿⣣⢟⡱⢮⡝⣮⢛⣼⡻⢿⣿⣿⣷⣯⣷⣭⢺⣍⠷⣣⢯⡽⣿⣿⡀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣏⠾⡜⡧⣿⡇⠀⠀⠀⠀⢼⣿⢲⡫⣝⣣⢞⡵⢫⣶⢻⢯⣾⡿⠀⠉⣿⣿⣿⢎⡯⢵⣺⣽⢻⣿⡇
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡯⣏⣳⢳⣿⡇⠀⠀⠀⠀⢾⣿⢣⡝⣮⠵⣮⣙⢿⡼⢯⣻⣿⡃⢀⣾⣿⡓⣮⠽⣸⢧⣟⡾⣿⡟⠁
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣼⣥⢻⣾⡇⠀⠀⠀⠀⢸⣿⢣⡟⡜⣧⢳⣭⣾⣽⡏⣿⣿⣴⣾⣿⢱⡝⣶⢫⢳⢻⣾⣿⣿⠁⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡿⢿⣯⣗⣿⡇⠀⠀⠀⠀⢹⣿⠮⡵⣛⣬⠳⣎⣷⣳⣿⣿⣿⣿⡿⣣⢯⡵⣋⢾⣹⢾⣽⣿⠃⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠈⠛⠿⠇⠀⠀⠀⠀⢸⣿⣷⣷⣿⣶⣿⣿⠿⠟⠛⣿⣿⣿⣗⣣⢧⢳⣫⢏⣿⣾⣿⠃⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⣿⣿⠟⠻⣿⣮⣷⣭⢿⣾⡿⠁⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣧⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠈⠙⢻⣿⢿⣿⡇⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⡻⣿⣷⣦⣤⣄⣀⣀⣀⣀⣀⣀⣀⣀⣀⣠⣤⣶⣾⣿⣿⡄⠀⠀⠀⢾⡇⠀⢸⡇⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡵⣓⢮⣝⢻⣛⢿⡻⢿⠿⠿⣟⢿⡻⣟⡟⣻⢯⡟⣽⣿⣷⡀⠀⠀⠈⠛⢀⣼⡇⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⣯⣾⣼⣷⣮⣷⣽⣮⣿⣽⣮⣷⣽⣶⣽⣧⣿⣽⣷⣾⣿⣟⢛⣛⣛⣛⠛⠋⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⢉⣭⣭⡥⠄⠀⠄⠀⠀⠀⠀⠀⠀

//

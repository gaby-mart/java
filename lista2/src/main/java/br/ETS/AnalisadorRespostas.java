package br.ETS;

public class AnalisadorRespostas {
    public static void conferirGabaraito(String respostaUsuario1, String respostaUsuario2, String respostaUsuario3){
        String respostaCorreta1 = "b", respostaCorreta2 = "a"; String respostaCorreta3 = "d";

        if(respostaUsuario1.equalsIgnoreCase(respostaCorreta1)){
            System.out.println("Parabens você acertou!!");
        } else if (!respostaUsuario1.equalsIgnoreCase(respostaCorreta1)) {
            System.out.println("Resposta Errada!");
            System.out.println("A resposta correta é " + respostaCorreta1);
        }

        if(respostaUsuario2.equalsIgnoreCase(respostaCorreta2)){
            System.out.println("Parabèn você acertou!");
        } else if (!respostaUsuario2.equalsIgnoreCase(respostaCorreta2)) {
            System.out.println("Resposta Errada!");
            System.out.println("A resposta correta é " + respostaCorreta2);
        }

        if(respostaUsuario3.equalsIgnoreCase(respostaCorreta3)){
            System.out.println("Parabèn você acertou!");
        } else if (!respostaUsuario3.equalsIgnoreCase(respostaCorreta3)) {
            System.out.println("Resposta Errada!");
            System.out.println("A resposta correta é " + respostaCorreta3);
        }
    }
}

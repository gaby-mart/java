package br.ETS;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mensalista giovanna = new Mensalista(92897452, "Giovanna",
                "Técnica de Desenvolvimento de Sistemas", 3500);
        System.out.printf("O salario de Giovanna é %.2f reais.\n", giovanna.receberSalario());

        Horista gabriel = new Horista("Gabriel", "Operador de Manufatura", 92907421, 240, 8.11);
        System.out.printf("O salario de Gabriel: R$ %.2f.\n", gabriel.receberSalario());
        System.out.println(gabriel);

        Usuario gabrielly = new Usuario("Gabrielly", "email@", "123");
        gabrielly.autenticar();
        gabrielly.concederAcessos();

        UsuarioAdmin leo = new UsuarioAdmin("Leo", "gmail", "123");
        leo.concederAcessos();

        Prioridade prioridade = Prioridade.URGENTE;

        switch (prioridade){
            case BAIXA -> System.out.println("Prioridade Baixa");
            case MEDIA -> System.out.println("Prioridade Média");
            case ALTA -> System.out.println("Prioridade Alta");
            case URGENTE -> System.out.println("Prioridade Urgente");
            default -> System.out.println("Prioridade não encontrada");
        }
    }
}
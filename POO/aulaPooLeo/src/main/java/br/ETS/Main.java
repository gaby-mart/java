package br.ETS;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Departamento departamento = new Departamento("ETS", 10.000, 100);

       departamento.exibirDetalhes();
        System.out.println(departamento.obterNumeroFuncionarios());
    }
}
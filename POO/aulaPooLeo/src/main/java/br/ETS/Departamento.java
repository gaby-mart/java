package br.ETS;

public class Departamento {
    private String nome;
    private double orcamento;
    private int numFuncionarios;

    public Departamento(String nome, double orcamento, int numFuncionarios) {
        this.nome = nome;
        this.orcamento = orcamento;
        this.numFuncionarios = numFuncionarios;
    }

    public void alterarNomeSetor(String novoNome){
        novoNome = nome;
    }

    public double calcularAumentoOrcamento(double percentual){
        return (orcamento * percentual) + orcamento;
    }

}

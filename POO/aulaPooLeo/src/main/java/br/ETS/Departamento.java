package br.ETS;

public class Departamento {
    String nome;
    double orcamento;
    int numFuncionarios;

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

    int obterNumeroFuncionarios(){
        return numFuncionarios;
    }

    public void exibirDetalhes(){
        System.out.printf("O departamento %s está com %d funcionários e com o orçamento de " + " de %.2f reais.\n",
                this.nome, this.numFuncionarios, this.orcamento);
    }
}

package br.ETS;

public class Horista extends Colaborador{
    double horasTrabalhadas;
    double salarioPorHora;

    public Horista(String nome, String cargo, int edv, double horasTrabalhadas, double salarioPorHora) {
        super(nome, cargo, edv);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }

    public double receberSalario(){
        double salario = this.salarioPorHora * this.horasTrabalhadas;
        return salario;
    }

    @Override
    public String toString(){
        return String.format("Colaborador: %s, Salário: %.2f", this.nome, receberSalario());
    }
}

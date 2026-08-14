package br.ETS;

public class Mensalista extends Colaborador{
    double salarioMensal;
    double bancoDeHoras;

    public Mensalista(int edv, String nome, String cargo, double salarioMensal){
        super(nome, cargo, edv);
        this.salarioMensal = salarioMensal;
    }

    double receberSalario(){
        return this.salarioMensal;
    }

}

package br.ETS;

public class Colaborador {
    private int edv;
    private String nome;
    private String cargo;

    public Colaborador(){
        System.out.println("Sem parâmetros");
    }

    public Colaborador(String nome){
        this.nome = nome;
        System.out.println("1 parâmetro");
    }

    public Colaborador(String nome, int edv){
        this.edv = edv;
        this.nome = nome;
        System.out.println("2 parâmetros");
    }

    public Colaborador(int edv, String nome, String cargo){
        this.edv = edv;
        this.nome = nome;
        this.cargo = cargo;
        System.out.println("3 parâmetros");
    }
}

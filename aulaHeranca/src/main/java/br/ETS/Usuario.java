package br.ETS;

public class Usuario {
    String nome;
    String email;
    String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    void autenticar(){
        System.out.printf("Usuario %s está autenticado\n", this.nome);
    }

    void concederAcessos(){
        System.out.printf("Usuario %s está com acessos regulares\n", this.nome);
    }
}

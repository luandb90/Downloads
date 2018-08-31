package com.example.luandbrito.libsearch;

/**
 * Created by luan.dbrito on 21/08/2018.
 */

public class Livros {


    private String nome;
    private String descricao;
    private String autor;
    private String email;
    private String senha;
    private String cpf;
    private String perco;
    private String thumbnail;

    public Livros() {
    }

    public Livros(String nome, String descricao, String autor, String email, String senha, String cpf, String perco, String image_url) {
        this.nome = nome;
        this.descricao = descricao;
        this.autor = autor;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.perco = perco;
        this.thumbnail = thumbnail;
    }

    public String getNome() {
        return nome;
    }

    public String getdescricao() {
        return descricao;
    }


    public void setDescription(String description) {
        descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPerco() {
        return perco;
    }

    public String getImage_url() {
        return thumbnail;
    }
}

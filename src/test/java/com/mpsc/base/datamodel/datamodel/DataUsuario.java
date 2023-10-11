package com.mpsc.base.datamodel.datamodel;

public class DataUsuario {

    public static String nome;
    public static String email;
    public static String senha;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        DataUsuario.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        DataUsuario.email = email;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        DataUsuario.senha = senha;
    }
}

package br.com.java;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    List<String> listaCadastro = new ArrayList<>();

    public void verCadastro(String cadastro) {
        listaCadastro.add(cadastro);
    }

    List<String> lerCadastro() {
        return listaCadastro;
    }
}
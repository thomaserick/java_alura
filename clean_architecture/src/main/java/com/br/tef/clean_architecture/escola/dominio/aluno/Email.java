package com.br.tef.clean_architecture.escola.dominio.aluno;

import java.util.Objects;

public class Email {

    private String endereco;

    public Email(String endereco) {
        if (Objects.isNull(endereco) || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("E-mail inválido!");
        }


        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}

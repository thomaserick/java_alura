package com.br.tef.clean_architecture.escola.aluno;

import java.util.Objects;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {

        if (Objects.isNull(ddd) || Objects.isNull(numero)) {
            throw new IllegalArgumentException("DDD e Numero são obrigado!");
        }
        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD inválido");
        }

        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Numero inválido!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }
}

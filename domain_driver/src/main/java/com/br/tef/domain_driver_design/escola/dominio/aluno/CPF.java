package com.br.tef.domain_driver_design.escola.dominio.aluno;

import java.util.Objects;

public class CPF {

    private String numero;

    public CPF(String numero) {
        if (Objects.isNull(numero) || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("E-mail inválido!");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}

package com.br.tef.domain_driver_design.gamificacao.dominio.selo;

import com.br.tef.domain_driver_design.shared.dominio.CPF;

public class Selo {
    private CPF cpfAluno;
    private String nome;

    public Selo(CPF cpfAluno, String nome) {
        this.cpfAluno = cpfAluno;
        this.nome = nome;
    }

    public CPF getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(CPF cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

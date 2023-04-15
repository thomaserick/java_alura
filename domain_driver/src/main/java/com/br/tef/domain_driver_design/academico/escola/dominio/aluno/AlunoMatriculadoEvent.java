package com.br.tef.domain_driver_design.academico.escola.dominio.aluno;

import com.br.tef.domain_driver_design.academico.escola.dominio.Events;

import java.time.LocalDateTime;

public class AlunoMatriculadoEvent implements Events {

    private final CPF cpf;
    private final LocalDateTime momento;

    public AlunoMatriculadoEvent(CPF cpf) {
        this.cpf = cpf;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }

    public CPF getCpf() {
        return cpf;
    }
}

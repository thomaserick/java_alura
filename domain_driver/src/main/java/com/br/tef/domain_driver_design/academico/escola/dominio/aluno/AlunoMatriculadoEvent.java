package com.br.tef.domain_driver_design.academico.escola.dominio.aluno;

import com.br.tef.domain_driver_design.shared.dominio.CPF;
import com.br.tef.domain_driver_design.shared.dominio.eventos.Events;
import com.br.tef.domain_driver_design.shared.dominio.eventos.TipoEvento;

import java.time.LocalDateTime;
import java.util.Map;

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

    @Override
    public TipoEvento tipo() {
        return TipoEvento.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> content() {
        return Map.of("cpf", this.cpf);
    }

    public CPF getCpf() {
        return cpf;
    }
}

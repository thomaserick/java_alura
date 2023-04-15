package com.br.tef.domain_driver_design.academico.escola.dominio.aluno;

import com.br.tef.domain_driver_design.academico.escola.dominio.Events;
import com.br.tef.domain_driver_design.academico.escola.dominio.Ouvinte;

public class LogDeAlunoMatriculado extends Ouvinte {

    public void reageAo(Events aluno) {
        System.out.printf("Aluno  com CPF:" + ((AlunoMatriculadoEvent) aluno).getCpf() + " matriculado em:" + aluno.momento());
    }


    @Override
    protected boolean deveProcessar(Events evento) {
        return evento instanceof AlunoMatriculadoEvent;
    }
}

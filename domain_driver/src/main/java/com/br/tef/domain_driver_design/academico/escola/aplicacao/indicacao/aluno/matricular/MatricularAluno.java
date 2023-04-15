package com.br.tef.domain_driver_design.academico.escola.aplicacao.indicacao.aluno.matricular;

import com.br.tef.domain_driver_design.academico.escola.dominio.aluno.Aluno;
import com.br.tef.domain_driver_design.academico.escola.dominio.aluno.AlunoMatriculadoEvent;
import com.br.tef.domain_driver_design.academico.escola.dominio.aluno.Email;
import com.br.tef.domain_driver_design.academico.escola.dominio.aluno.RepositorioDeAlunos;
import com.br.tef.domain_driver_design.shared.dominio.CPF;
import com.br.tef.domain_driver_design.shared.dominio.eventos.PublicadorDeEventos;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorioDeAlunos;

    private final PublicadorDeEventos publicador;

    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos, PublicadorDeEventos publicador) {
        this.repositorioDeAlunos = repositorioDeAlunos;
        this.publicador = publicador;
    }

    public void matricular(MatricularAlunoDTO matricular) {

        var cpf = new CPF(matricular.getCpf());
        var email = new Email(matricular.getEmail());

        Aluno aluno = new Aluno(cpf, matricular.getNome(), email);
        repositorioDeAlunos.matricular(aluno);

        AlunoMatriculadoEvent alunoMatriculadoEvent = new AlunoMatriculadoEvent(aluno.getCpf());
        publicador.publicar(alunoMatriculadoEvent);

    }
}

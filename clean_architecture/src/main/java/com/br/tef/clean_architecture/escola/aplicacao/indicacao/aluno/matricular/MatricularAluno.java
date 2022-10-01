package com.br.tef.clean_architecture.escola.aplicacao.indicacao.aluno.matricular;

import com.br.tef.clean_architecture.escola.dominio.aluno.Aluno;
import com.br.tef.clean_architecture.escola.dominio.aluno.CPF;
import com.br.tef.clean_architecture.escola.dominio.aluno.Email;
import com.br.tef.clean_architecture.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorioDeAlunos;

    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
    }

    public void matricular(MatricularAlunoDTO matricular) {

        var cpf = new CPF(matricular.getCpf());
        var email = new Email(matricular.getEmail());

        Aluno aluno = new Aluno(cpf, matricular.getNome(), email);
        repositorioDeAlunos.matricular(aluno);

    }
}

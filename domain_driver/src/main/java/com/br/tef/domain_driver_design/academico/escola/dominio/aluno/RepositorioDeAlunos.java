package com.br.tef.domain_driver_design.academico.escola.dominio.aluno;

import com.br.tef.domain_driver_design.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeAlunos {
    void matricular(Aluno aluno);

    Aluno buscarPorCPF(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}

package com.br.tef.domain_driver_design.escola.dominio.aluno;

import java.util.List;

public interface RepositorioDeAlunos {
    void matricular(Aluno aluno);

    Aluno buscarPorCPF(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}

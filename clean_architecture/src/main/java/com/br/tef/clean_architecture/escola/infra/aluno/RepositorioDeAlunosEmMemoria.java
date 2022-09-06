package com.br.tef.clean_architecture.escola.infra.aluno;

import com.br.tef.clean_architecture.escola.dominio.aluno.Aluno;
import com.br.tef.clean_architecture.escola.dominio.aluno.CPF;
import com.br.tef.clean_architecture.escola.dominio.aluno.RepositorioDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);

    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return this.matriculados.stream()
                .filter(aluno -> aluno.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }
}

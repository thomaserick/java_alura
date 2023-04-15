package com.br.tef.domain_driver_design.academico.escola.infra.aluno;

import com.br.tef.domain_driver_design.academico.escola.dominio.aluno.Aluno;
import com.br.tef.domain_driver_design.academico.escola.dominio.aluno.RepositorioDeAlunos;
import com.br.tef.domain_driver_design.shared.dominio.CPF;

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

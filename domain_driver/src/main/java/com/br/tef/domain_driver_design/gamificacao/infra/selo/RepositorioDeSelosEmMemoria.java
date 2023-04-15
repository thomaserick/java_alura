package com.br.tef.domain_driver_design.gamificacao.infra.selo;

import com.br.tef.domain_driver_design.academico.escola.dominio.aluno.CPF;
import com.br.tef.domain_driver_design.gamificacao.dominio.selo.RepositorioDeSelos;
import com.br.tef.domain_driver_design.gamificacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionarSelo(Selo selo) {
        this.selos.add(selo);

    }

    @Override
    public List<Selo> selosDoAlunoDeCpf(CPF cpf) {
        return this.selos.stream().filter(selo -> selo.getCpfAluno().equals(cpf)).collect(Collectors.toList());
    }
}

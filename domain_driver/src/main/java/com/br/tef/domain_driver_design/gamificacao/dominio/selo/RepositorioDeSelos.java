package com.br.tef.domain_driver_design.gamificacao.dominio.selo;

import com.br.tef.domain_driver_design.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionarSelo(Selo selo);

    List<Selo> selosDoAlunoDeCpf(CPF cpf);
}

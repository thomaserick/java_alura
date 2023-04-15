package com.br.tef.domain_driver_design.gamificacao.aplicacao;

import com.br.tef.domain_driver_design.gamificacao.dominio.selo.Selo;
import com.br.tef.domain_driver_design.gamificacao.infra.selo.RepositorioDeSelosEmMemoria;
import com.br.tef.domain_driver_design.shared.dominio.CPF;
import com.br.tef.domain_driver_design.shared.dominio.eventos.Events;
import com.br.tef.domain_driver_design.shared.dominio.eventos.Ouvinte;
import com.br.tef.domain_driver_design.shared.dominio.eventos.TipoEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

    private final RepositorioDeSelosEmMemoria repositorioDeSelosEmMemoria;

    public GeraSeloAlunoNovato(RepositorioDeSelosEmMemoria repositorioDeSelosEmMemoria) {
        this.repositorioDeSelosEmMemoria = repositorioDeSelosEmMemoria;
    }

    @Override
    protected void reageAo(Events evento) {
        Selo novato = new Selo((CPF) evento.content().get("cpf"), "Novato");
        repositorioDeSelosEmMemoria.adicionarSelo(novato);
    }

    @Override
    protected boolean deveProcessar(Events evento) {
        return evento.tipo().equals(TipoEvento.ALUNO_MATRICULADO);
    }
}

package com.br.tef.domain_driver_design.shared.dominio.eventos;

public abstract class Ouvinte {

    public void processa(Events evento) {
        if (this.deveProcessar(evento)) {
            this.reageAo(evento);
        }
    }

    protected abstract void reageAo(Events evento);

    protected abstract boolean deveProcessar(Events evento);
}

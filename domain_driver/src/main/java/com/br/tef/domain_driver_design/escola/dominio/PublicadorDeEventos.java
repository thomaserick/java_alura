package com.br.tef.domain_driver_design.escola.dominio;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEventos {

    private List<Ouvinte> ouvines = new ArrayList<>();

    public void adicionar(Ouvinte ouvinte) {
        this.ouvines.add(ouvinte);
    }

    public void publicar(Events evento) {
        this.ouvines.forEach(ouvinte -> ouvinte.processa(evento));
    }
}

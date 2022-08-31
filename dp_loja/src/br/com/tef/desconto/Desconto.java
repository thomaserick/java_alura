package br.com.tef.desconto;

import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    protected Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    protected abstract BigDecimal calcular(Orcamento orcamento);
}

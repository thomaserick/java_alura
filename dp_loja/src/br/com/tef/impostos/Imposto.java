package br.com.tef.impostos;

import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Imposto {
    private Imposto outro;


    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        var valorImposto = realizarCalculo(orcamento);
        var valorDoOutroImposto = BigDecimal.ZERO;

        if (Objects.nonNull(valorDoOutroImposto)) {
            valorDoOutroImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorDoOutroImposto);

    }

}

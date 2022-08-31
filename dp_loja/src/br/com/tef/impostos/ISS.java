package br.com.tef.impostos;

import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}

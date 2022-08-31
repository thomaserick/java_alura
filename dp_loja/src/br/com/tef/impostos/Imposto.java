package br.com.tef.impostos;

import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}

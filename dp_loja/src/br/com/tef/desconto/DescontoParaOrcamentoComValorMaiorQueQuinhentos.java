package br.com.tef.desconto;

import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0 ?
                orcamento.getValor().multiply(new BigDecimal("0.05")) : proximo.calcular(orcamento);
    }
}


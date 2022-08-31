package br.com.tef.desconto;

import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

    public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getQtdeItens() > 5 ?
                orcamento.getValor().multiply(new BigDecimal("0.1")) :
                proximo.calcular(orcamento);
    }
}

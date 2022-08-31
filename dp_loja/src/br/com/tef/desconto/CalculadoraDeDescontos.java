package br.com.tef.desconto;

import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}

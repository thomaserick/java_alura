package br.com.tef;

import br.com.tef.desconto.CalcularDesconto;
import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;

public class mainDescontos {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        CalcularDesconto calcularDesconto = new CalcularDesconto();
        System.out.println(calcularDesconto.calcular(orcamento1));
        System.out.println(calcularDesconto.calcular(orcamento2));
    }


}

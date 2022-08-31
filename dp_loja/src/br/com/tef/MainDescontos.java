package br.com.tef;

import br.com.tef.desconto.CalculadoraDeDescontos;
import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;

public class MainDescontos {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calcularDesconto = new CalculadoraDeDescontos();
        System.out.println(calcularDesconto.calcular(orcamento1));
        System.out.println(calcularDesconto.calcular(orcamento2));
    }


}

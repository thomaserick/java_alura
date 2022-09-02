package br.com.tef;

import br.com.tef.impostos.CalculadoraDeImpostos;
import br.com.tef.impostos.ISS;
import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        var orcamento = new Orcamento(new BigDecimal("100"), 1);
        var calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS(null)));
    }


}

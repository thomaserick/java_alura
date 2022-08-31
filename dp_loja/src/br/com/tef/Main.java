package br.com.tef;

import br.com.tef.impostos.CalculadoraDeImpostos;
import br.com.tef.impostos.ISS;
import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));

    }


}

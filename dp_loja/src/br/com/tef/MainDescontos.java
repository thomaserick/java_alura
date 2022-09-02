package br.com.tef;

import br.com.tef.desconto.CalculadoraDeDescontos;
import br.com.tef.orcamento.Orcamento;

public class MainDescontos {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento();
        Orcamento orcamento2 = new Orcamento();
        CalculadoraDeDescontos calcularDesconto = new CalculadoraDeDescontos();
        System.out.println(calcularDesconto.calcular(orcamento1));
        System.out.println(calcularDesconto.calcular(orcamento2));
    }


}

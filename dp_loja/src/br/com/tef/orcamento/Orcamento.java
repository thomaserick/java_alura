package br.com.tef.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int qtdeItens;
    private String situcao;

    public Orcamento(BigDecimal valor, int qtdeItens) {
        this.valor = valor;
        this.qtdeItens = qtdeItens;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = BigDecimal.ZERO;

        if (situcao.equals("EM ANALISE")) {
            valorDoDescontoExtra = new BigDecimal("0.05");
        } else if (situcao.equals("APROVADO")) {
            valorDoDescontoExtra = new BigDecimal("0.02");
        }
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQtdeItens() {
        return qtdeItens;
    }
}

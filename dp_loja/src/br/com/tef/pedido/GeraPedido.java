package br.com.tef.pedido;

import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private LocalDateTime data;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, LocalDateTime data, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.data = data;
        this.quantidadeItens = quantidadeItens;
    }

    public void executa() {
        var data = LocalDateTime.now();
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
        Pedido pedido = new Pedido(cliente, data, orcamento);
    }


}

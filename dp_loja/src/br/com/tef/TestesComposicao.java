package br.com.tef;

import br.com.tef.orcamento.ItemOrcamento;
import br.com.tef.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesComposicao {

    public static void main(String[] args) {
        var antigo = new Orcamento();
        antigo.adicionarIten(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        var novo = new Orcamento();
        novo.adicionarIten(new ItemOrcamento(new BigDecimal("200")));
        novo.adicionarIten(antigo);

    }


}

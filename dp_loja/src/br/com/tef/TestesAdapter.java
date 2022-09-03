package br.com.tef;

import br.com.tef.http.JavaHttpClient;
import br.com.tef.orcamento.Orcamento;
import br.com.tef.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args) {
        var orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        var registro = new RegistroDeOrcamento(new JavaHttpClient());
    }


}

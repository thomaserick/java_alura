package br.com.tef.orcamento;

import br.com.tef.exception.DomainException;
import br.com.tef.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if (orcamento.isFinalizado()) {
            throw new DomainException("Orcamento não Finalizado!");
        }

        var url = "http:/api.orcamanto";
        Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "quantidadeItens", orcamento.getQtdeItens());
        http.post(url, dados);
    }
}

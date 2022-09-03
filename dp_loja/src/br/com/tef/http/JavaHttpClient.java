package br.com.tef.http;

import java.net.URL;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            var urlApi = new URL(url);
            var connection = urlApi.openConnection();
            connection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao envia requisição Http!");
        }

    }
}

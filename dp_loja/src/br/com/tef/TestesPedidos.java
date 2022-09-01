package br.com.tef;

import br.com.tef.pedido.GeraPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {

    public static void main(String[] args) {
        new GeraPedido("Thomas", new BigDecimal("600"), LocalDateTime.now(), 4);
    }


}

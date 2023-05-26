package br.com.tef.alurafood.dto;

import br.com.tef.alurafood.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;


@Getter
@Setter
public class PagamentoDTO {

    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Status status;
    private Long pedidoId;
    private Long formaDePagamentoId;
    private ZonedDateTime dataCriacao;
}

package com.br.tef.domain_driver_design.shared.dominio.eventos;

import java.time.LocalDateTime;
import java.util.Map;

public interface Events {

    LocalDateTime momento();

    TipoEvento tipo();

    Map<String, Object> content();
}

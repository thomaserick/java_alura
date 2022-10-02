package com.br.tef.domain_driver_design.escola;

import com.br.tef.domain_driver_design.escola.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {

    @Test
    void naoDeveriaCriarEmailComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("emailInvalido"));
    }
}

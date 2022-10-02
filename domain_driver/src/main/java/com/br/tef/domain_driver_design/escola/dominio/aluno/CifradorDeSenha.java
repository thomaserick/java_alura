package com.br.tef.domain_driver_design.escola.dominio.aluno;

public interface CifradorDeSenha {
    String cifrarSenha(String senha);

    boolean validarSenhaCifrada(String senhaCifrada, String senha);
}

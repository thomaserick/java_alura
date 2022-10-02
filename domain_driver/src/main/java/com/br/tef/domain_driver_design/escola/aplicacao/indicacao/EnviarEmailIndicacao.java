package com.br.tef.domain_driver_design.escola.aplicacao.indicacao;

import com.br.tef.domain_driver_design.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno aluno);
}

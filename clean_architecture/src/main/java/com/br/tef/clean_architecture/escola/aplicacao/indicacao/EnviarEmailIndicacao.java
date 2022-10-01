package com.br.tef.clean_architecture.escola.aplicacao.indicacao;

import com.br.tef.clean_architecture.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno aluno);
}

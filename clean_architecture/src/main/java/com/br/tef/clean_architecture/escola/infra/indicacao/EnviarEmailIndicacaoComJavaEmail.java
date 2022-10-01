package com.br.tef.clean_architecture.escola.infra.indicacao;

import com.br.tef.clean_architecture.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import com.br.tef.clean_architecture.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaEmail implements EnviarEmailIndicacao {
    @Override
    public void enviarPara(Aluno aluno) {
        //Logica de enviar e-mail;
    }
}

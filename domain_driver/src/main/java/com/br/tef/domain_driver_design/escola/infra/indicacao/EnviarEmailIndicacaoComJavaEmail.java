package com.br.tef.domain_driver_design.escola.infra.indicacao;

import com.br.tef.domain_driver_design.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import com.br.tef.domain_driver_design.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaEmail implements EnviarEmailIndicacao {
    @Override
    public void enviarPara(Aluno aluno) {
        //Logica de enviar e-mail;
    }
}

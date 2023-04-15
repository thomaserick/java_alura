package com.br.tef.domain_driver_design.academico.escola.infra.indicacao;

import com.br.tef.domain_driver_design.academico.escola.dominio.aluno.Aluno;
import com.br.tef.domain_driver_design.academico.escola.aplicacao.indicacao.EnviarEmailIndicacao;

public class EnviarEmailIndicacaoComJavaEmail implements EnviarEmailIndicacao {
    @Override
    public void enviarPara(Aluno aluno) {
        //Logica de enviar e-mail;
    }
}

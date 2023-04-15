package com.br.tef.domain_driver_design.academico.escola.dominio.aluno;

import com.br.tef.domain_driver_design.shared.dominio.CPF;

public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero) {
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno Criar() {
        return this.aluno;
    }
}

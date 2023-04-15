package com.br.tef.domain_driver_design.academico.escola.dominio.aluno;

import com.br.tef.domain_driver_design.shared.dominio.CPF;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private CPF cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    private String senha;

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public CPF getCpf() {
        return cpf.getNumero();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void adicionarTelefone(String ddd, String numero) {
        if (telefones.size() == 2) {
            throw new IllegalArgumentException("Numero maximo de telefones máximo atingido.");
        }
        telefones.add(new Telefone(ddd, numero));
    }

    public String getSenha() {
        return senha;
    }
}

package com.br.tef.clean_architecture.escola.aplicacao.indicacao.aluno.matricular;

public class MatricularAlunoDTO {

    private String nome;
    private String cpf;
    private String email;

    public MatricularAlunoDTO(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
}

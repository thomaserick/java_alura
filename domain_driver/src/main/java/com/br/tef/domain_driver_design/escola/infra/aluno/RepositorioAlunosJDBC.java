package com.br.tef.domain_driver_design.escola.infra.aluno;

import com.br.tef.domain_driver_design.escola.dominio.aluno.Aluno;
import com.br.tef.domain_driver_design.escola.dominio.aluno.CPF;
import com.br.tef.domain_driver_design.escola.dominio.aluno.RepositorioDeAlunos;
import com.br.tef.domain_driver_design.escola.dominio.aluno.Telefone;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class RepositorioAlunosJDBC implements RepositorioDeAlunos {

    private final Connection connection;


    public RepositorioAlunosJDBC(Connection collection) {
        this.connection = collection;
    }

    @Override
    public void matricular(Aluno aluno) {
        String sql = "INSERT INTO ALUNO VALUES(?,?,?)";
        try {
            var ps = connection.prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getEmail());
            ps.execute();


            sql = "insert INTO TELEFONE VALUES (?,?)";
            ps = connection.prepareStatement(sql);

            for (Telefone telefone : aluno.getTelefones()) {
                ps.setString(1, telefone.getDdd());
                ps.setString(2, telefone.getNumero());
                ps.execute();
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }
}

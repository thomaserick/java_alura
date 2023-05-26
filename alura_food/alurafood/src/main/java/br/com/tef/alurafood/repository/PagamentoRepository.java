package br.com.tef.alurafood.repository;


import br.com.tef.alurafood.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento,Long> {
}

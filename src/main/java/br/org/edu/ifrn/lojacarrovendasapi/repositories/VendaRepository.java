package br.org.edu.ifrn.lojacarrovendasapi.repositories;

import br.org.edu.ifrn.lojacarrovendasapi.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}
package br.com.manage_cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.manage_cars.model.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {

}

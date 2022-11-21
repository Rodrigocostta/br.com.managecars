package br.com.manage_cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.manage_cars.model.TipoServico;

@Repository
public interface TipoServicoRepository extends JpaRepository<TipoServico, Long> {

}

package br.com.api.suplementos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.suplementos.domain.Suplemento;

@Repository
public interface SuplementoRepository extends JpaRepository<Suplemento, Long>{

}

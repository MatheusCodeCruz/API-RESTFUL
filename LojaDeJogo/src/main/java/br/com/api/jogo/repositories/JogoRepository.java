package br.com.api.jogo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.jogo.domain.Jogo;

public interface JogoRepository extends JpaRepository <Jogo, Long>{

}

package br.com.monstropedia.api.repository;

import br.com.monstropedia.api.model.Criatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CriaturaRepository extends JpaRepository<Criatura, Long> {

	

}
package br.com.enciclopedia.api.repository;

import br.com.enciclopedia.api.model.Criatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CriaturaRepository extends JpaRepository<Criatura, Long> {
}
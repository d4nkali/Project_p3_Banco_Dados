package br.com.criaturaspedia.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.criaturaspedia.api.model.Habilidade;

@Repository
public interface HabilidadeRepository extends JpaRepository<Habilidade, Long>{



}

package br.com.criaturaspedia.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.criaturaspedia.api.model.Criatura;
import br.com.criaturaspedia.api.model.Habilidade;
import br.com.criaturaspedia.api.model.Habitat;

public interface CriaturaRepository extends JpaRepository<Criatura, Long>{

	List<Habilidade> findByHabilidadeId(Long habilidadeId);
	List<Habitat> findByHabitatId(Long habitatId);

}

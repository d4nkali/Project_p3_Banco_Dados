package br.com.criaturaspedia.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.criaturaspedia.api.model.Habitat;

@Repository
public interface HabitatRepository extends JpaRepository<Habitat, Long>{

}

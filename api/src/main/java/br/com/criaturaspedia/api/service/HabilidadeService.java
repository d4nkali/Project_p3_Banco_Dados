package br.com.criaturaspedia.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.criaturaspedia.api.model.Habilidade;
import br.com.criaturaspedia.api.repository.HabilidadeRepository;

@Service
public class HabilidadeService {

	@Autowired
	HabilidadeRepository habilidadeRepository;

	public void criarHabilidade(Habilidade habilidade) {

		habilidadeRepository.save(habilidade);

	}

}

package br.com.criaturaspedia.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.criaturaspedia.api.model.Habilidade;
import br.com.criaturaspedia.api.repository.HabilidadeRepository;

@Service
public class HabilidadeService {

	@Autowired
	HabilidadeRepository habilidadeRepository;

	public void criarHabilidade(Habilidade habilidade) {

		habilidadeRepository.save(habilidade);

	}

	public List<Habilidade> listarTodasHabilidades() {

		return habilidadeRepository.findAll();

	}

	public Optional<Habilidade> buscarHabilidadePorId(Long id) {

		return habilidadeRepository.findById(id);

	}

	public void deletarHabilidadePorId(Long id) {

		habilidadeRepository.deleteById(id);

	}

	public void atualizarHabilidadePorId(Long id, Habilidade habilidade) {

		Optional<Habilidade> habilidadeDoBanco = buscarHabilidadePorId(id);

		if (habilidadeDoBanco.isEmpty()) {

			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Habilidade não encontrada no banco de dados");

		}

		Habilidade habilidadeEditada = habilidadeDoBanco.get();

		habilidadeEditada.setNome(habilidade.getNome());
		habilidadeEditada.setDescricao(habilidade.getDescricao());

		habilidadeRepository.save(habilidadeEditada);

	}

}

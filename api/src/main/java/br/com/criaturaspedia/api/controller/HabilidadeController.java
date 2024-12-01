package br.com.criaturaspedia.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.criaturaspedia.api.model.Habilidade;
import br.com.criaturaspedia.api.service.HabilidadeService;

@RestController
@RequestMapping("/habilidade")
public class HabilidadeController {

	@Autowired
	HabilidadeService habilidadeService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void criarHabilidade(@RequestBody Habilidade habilidade) {

		habilidadeService.criarHabilidade(habilidade);

	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Habilidade> listarTodasHabilidades() {

		return habilidadeService.listarTodasHabilidades();

	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Habilidade> buscarHabilidadePorId(@PathVariable Long id) {
		return habilidadeService.buscarHabilidadePorId(id);
	}

	@DeleteMapping("/{id}") // Mapeia para usar o método Delete
	@ResponseStatus(HttpStatus.NO_CONTENT) // Retorna o código 204(No Content)
	public void deletarHabilidadePorId(@PathVariable Long id) {

		habilidadeService.deletarHabilidadePorId(id);

	}

	@PutMapping("/{id}") // Mapeia para usar o método Put
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void atualizarHabilidadePorId(@PathVariable Long id, @RequestBody Habilidade habilidade) {

		habilidadeService.atualizarHabilidadePorId(id, habilidade);

	}

}

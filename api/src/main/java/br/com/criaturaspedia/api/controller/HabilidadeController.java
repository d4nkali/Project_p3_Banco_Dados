package br.com.criaturaspedia.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
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

}

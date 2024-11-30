package br.com.criaturaspedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.criaturaspedia.api.model.Habilidade;
import br.com.criaturaspedia.api.service.HabilidadeService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

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
}

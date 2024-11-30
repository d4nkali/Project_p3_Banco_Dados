package br.com.criaturaspedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.criaturaspedia.api.model.Habitate;
import br.com.criaturaspedia.api.service.HabitateService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/habitate")
public class HabitateController {

	@Autowired
	HabitateService habitateService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void criarHabitate(@RequestBody Habitate habitate) {

		habitateService.criarHabitate(habitate);
	}

	@GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Habitate> listarTodosHabitates() {
        return habitateService.listarTodosHabitates();
    }
}

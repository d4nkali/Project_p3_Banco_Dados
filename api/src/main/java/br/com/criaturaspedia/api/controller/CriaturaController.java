package br.com.criaturaspedia.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.com.criaturaspedia.api.model.Criatura;
import br.com.criaturaspedia.api.service.CriaturaService;

@RestController
@RequestMapping("/criatura")
public class CriaturaController {

    @Autowired
    CriaturaService criaturaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarCriatura(@RequestBody Criatura criatura) {
        criaturaService.criarCriatura(criatura);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Criatura> listarTodasCriaturas() {
        return criaturaService.listarTodasCriaturas();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Criatura> buscarCriaturaPorId(@PathVariable Long id) {
        return criaturaService.buscarCriaturaPorId(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarCriaturaPorId(@PathVariable Long id) {
        criaturaService.deletarCriaturaPorId(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarCriaturaPorId(@PathVariable Long id, @RequestBody Criatura criatura) {
        criaturaService.atualizarCriaturaPorId(id, criatura);
    }

}

// api/src/main/java/br/com/criaturaspedia/api/controller/HabitatController.java
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

import br.com.criaturaspedia.api.model.Habitat;
import br.com.criaturaspedia.api.service.HabitatService;

@RestController
@RequestMapping("/habitat")
public class HabitatController {

    @Autowired
    HabitatService habitatService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarHabitat(@RequestBody Habitat habitat) {
        habitatService.criarHabitat(habitat);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Habitat> listarTodosHabitats() {
        return habitatService.listarTodosHabitats();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Habitat> buscarHabitatPorId(@PathVariable Long id) {
        return habitatService.buscarHabitatPorId(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarHabitatPorId(@PathVariable Long id) {
        habitatService.deletarHabitatPorId(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarHabitatPorId(@PathVariable Long id, @RequestBody Habitat habitat) {
        habitatService.atualizarHabitatPorId(id, habitat);
    }

}

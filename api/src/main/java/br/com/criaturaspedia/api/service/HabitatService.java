// api/src/main/java/br/com/criaturaspedia/api/service/HabitatService.java
package br.com.criaturaspedia.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.criaturaspedia.api.model.Habitat;
import br.com.criaturaspedia.api.repository.HabitatRepository;

@Service
public class HabitatService {

    @Autowired
    HabitatRepository habitatRepository;

    public void criarHabitat(Habitat habitat) {
        habitatRepository.save(habitat);
    }

    public List<Habitat> listarTodosHabitats() {
        return habitatRepository.findAll();
    }

    public Optional<Habitat> buscarHabitatPorId(Long id) {
        return habitatRepository.findById(id);
    }

    public void deletarHabitatPorId(Long id) {
        habitatRepository.deleteById(id);
    }

    public void atualizarHabitatPorId(Long id, Habitat habitat) {

        Optional<Habitat> habitatDoBanco = buscarHabitatPorId(id);

        if (habitatDoBanco.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Habitat não encontrado no banco de dados");
        }

        Habitat habitatEditado = habitatDoBanco.get();
        habitatEditado.setNome(habitat.getNome());
        habitatEditado.setDescricao(habitat.getDescricao());
		habitatEditado.setClima(habitat.getClima());

        habitatRepository.save(habitatEditado);

    }

}

package br.com.criaturaspedia.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.criaturaspedia.api.model.Criatura;
import br.com.criaturaspedia.api.repository.CriaturaRepository;

@Service
public class CriaturaService {

    @Autowired
    CriaturaRepository criaturaRepository;

    public void criarCriatura(Criatura criatura) {
        criaturaRepository.save(criatura);
    }

    public List<Criatura> listarTodasCriaturas() {
        return criaturaRepository.findAll();
    }

    public Optional<Criatura> buscarCriaturaPorId(Long id) {
        return criaturaRepository.findById(id);
    }

    public void deletarCriaturaPorId(Long id) {
        criaturaRepository.deleteById(id);
    }

    public void atualizarCriaturaPorId(Long id, Criatura criatura) {
        Optional<Criatura> criaturaDoBanco = buscarCriaturaPorId(id);

        if (criaturaDoBanco.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Criatura não encontrada no banco de dados");
        }

        Criatura criaturaEditada = criaturaDoBanco.get();
        criaturaEditada.setNome(criatura.getNome());
        criaturaEditada.setDescricao(criatura.getDescricao());
		criaturaEditada.setHabilidade(criatura.getHabilidade());
		criaturaEditada.setHabitat(criatura.getHabitat());
		criaturaEditada.setClasse(criatura.getClasse());

        criaturaRepository.save(criaturaEditada);
    }

}

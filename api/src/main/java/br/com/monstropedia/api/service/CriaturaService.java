package br.com.monstropedia.api.service;

import br.com.monstropedia.api.model.Criatura;
import br.com.monstropedia.api.repository.CriaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriaturaService {

    @Autowired
    private CriaturaRepository repository;

    public List<Criatura> listarCriaturas() {
        return repository.findAll();
    }

    public Criatura salvarCriatura(Criatura criatura) {
        return repository.save(criatura);
    }
}

package br.com.criaturaspedia.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.criaturaspedia.api.model.Habitate;
import br.com.criaturaspedia.api.repository.HabitateRepository;

@Service
public class HabitateService {

    @Autowired
    private HabitateRepository habitateRepository;

    public void criarHabitate(Habitate habitate) {
        habitateRepository.save(habitate);
    }

	public List<Habitate> listarTodosHabitates() {
        return habitateRepository.findAll();
    }
}
package br.com.enciclopedia.api.controller;

import br.com.enciclopedia.api.model.Criatura;
import br.com.enciclopedia.api.service.CriaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/criaturas")
public class CriaturaController {
    @Autowired
    private CriaturaService service;

    @GetMapping
    public String listarCriaturas(Model model) {
        model.addAttribute("criaturas", service.listarCriaturas());
        return "criaturas";
    }

    @PostMapping
    public String salvarCriatura(Criatura criatura) {
        service.salvarCriatura(criatura);
        return "redirect:/criaturas";
    }
}
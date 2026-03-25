package com.jpaacademia.jpaacademia.controllers;

import com.jpaacademia.jpaacademia.dtos.AvaliacaoFisicaDTO;
import com.jpaacademia.jpaacademia.models.AvaliacaoFisica;
import com.jpaacademia.jpaacademia.service.interfaces.IAvaliacaoFisicaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    private final IAvaliacaoFisicaService avaliacaoFisicaService;

    @Autowired
    public AvaliacaoFisicaController(IAvaliacaoFisicaService avaliacaoFisicaService) {
        this.avaliacaoFisicaService = avaliacaoFisicaService;
    }

    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaDTO avaliacaoFisica) {
        return avaliacaoFisicaService.create(avaliacaoFisica);
    }

    @GetMapping
    public List<AvaliacaoFisica> todasAsAvaliacoes() {
        return avaliacaoFisicaService.getTodasAsAvaliacoesFisicas();
    }

    @GetMapping("/{id}")
    public AvaliacaoFisica buscarPorId(@PathVariable Long id) {
        return avaliacaoFisicaService.buscarAvaliacaoFisicaPorId(id);
    }

    @PutMapping("/{id}")
    public AvaliacaoFisica atualizarPorId(@PathVariable String id, @RequestBody AvaliacaoFisicaDTO avaliacaoFisica) {
        return avaliacaoFisicaService.atualizarAvaliacaoFisica(Long.parseLong(id), avaliacaoFisica);
    }

    @DeleteMapping("/{id}")
    public AvaliacaoFisica deletarPorId(@PathVariable String id) {
        return avaliacaoFisicaService.deletarAvaliacaoFisica(Long.parseLong(id));
    }
}

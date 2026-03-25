package com.jpaacademia.jpaacademia.controllers;

import com.jpaacademia.jpaacademia.dtos.MatriculaDTO;
import com.jpaacademia.jpaacademia.models.Matricula;
import com.jpaacademia.jpaacademia.service.interfaces.IMatriculaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    private final IMatriculaService matriculaService;

    @Autowired
    public MatriculaController(IMatriculaService matriculaService) {
        this.matriculaService = matriculaService;
    }

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaDTO alunoId) {
        return matriculaService.create(Long.parseLong(alunoId.alunoId()));
    }

    @GetMapping
    public List<Matricula> todasAsMatriculas(){
        return matriculaService.getAll();
    }
}

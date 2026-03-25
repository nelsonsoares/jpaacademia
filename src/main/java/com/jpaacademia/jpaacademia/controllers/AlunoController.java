package com.jpaacademia.jpaacademia.controllers;

import com.jpaacademia.jpaacademia.dtos.AlunoDTO;
import com.jpaacademia.jpaacademia.models.Aluno;
import com.jpaacademia.jpaacademia.service.interfaces.IAlunoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final IAlunoService alunoService;

    @Autowired
    public AlunoController(IAlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoDTO aluno){
        return alunoService.create(aluno);
    }

    @GetMapping
    public List<Aluno> todosOsAlunos(){
        return alunoService.getTodosOsAlunos();
    }

    @GetMapping("/{id}")
    public Aluno buscarPorId(@PathVariable String id){
        return alunoService.buscarAlunoPorId(Long.parseLong(id));
    }

    @DeleteMapping("/{id}")
    public Aluno deletarPorId(@PathVariable String id){
        return alunoService.deletarAluno(Long.parseLong(id));
    }

    @PutMapping("/{id}")
    public Aluno atualizarPorId(@PathVariable String alunoId, @RequestBody AlunoDTO aluno){
        return alunoService.atualizarAluno(Long.parseLong(alunoId), aluno);
    }
}

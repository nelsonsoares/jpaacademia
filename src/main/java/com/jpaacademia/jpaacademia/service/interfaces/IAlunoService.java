package com.jpaacademia.jpaacademia.service.interfaces;

import com.jpaacademia.jpaacademia.dtos.AlunoDTO;
import com.jpaacademia.jpaacademia.models.Aluno;

import java.util.List;

public interface IAlunoService {
    Aluno create(AlunoDTO aluno);
    List<Aluno> getTodosOsAlunos();
    Aluno buscarAlunoPorId(Long id);
    Aluno deletarAluno(Long id);
    Aluno atualizarAluno(Long id, AlunoDTO aluno);
}

package com.jpaacademia.jpaacademia.service.interfaces;

import com.jpaacademia.jpaacademia.models.Matricula;

import java.util.List;

public interface IMatriculaService {
    Matricula create(Long id);
    List<Matricula> getAll();
    Matricula buscarPorId(Long id);
    Matricula deletarPorId(Long id);
    Matricula atualizarPorId(Long idAluno, Matricula matricula);
}

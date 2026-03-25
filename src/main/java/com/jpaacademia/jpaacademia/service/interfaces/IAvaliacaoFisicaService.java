package com.jpaacademia.jpaacademia.service.interfaces;

import com.jpaacademia.jpaacademia.dtos.AvaliacaoFisicaDTO;
import com.jpaacademia.jpaacademia.models.AvaliacaoFisica;

import java.util.List;

public interface IAvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaDTO avaliacaoFisica);
    List<AvaliacaoFisica> getTodasAsAvaliacoesFisicas();
    AvaliacaoFisica buscarAvaliacaoFisicaPorId(Long id);
    AvaliacaoFisica atualizarAvaliacaoFisica(Long id, AvaliacaoFisicaDTO avaliacaoFisica);
    AvaliacaoFisica deletarAvaliacaoFisica(Long id);
    List<AvaliacaoFisica>todasAsAvaliacoesFisicasPorAluno(Long id);
}

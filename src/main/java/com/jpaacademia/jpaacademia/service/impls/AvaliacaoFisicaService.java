package com.jpaacademia.jpaacademia.service.impls;

import com.jpaacademia.jpaacademia.dtos.AvaliacaoFisicaDTO;
import com.jpaacademia.jpaacademia.models.Aluno;
import com.jpaacademia.jpaacademia.models.AvaliacaoFisica;
import com.jpaacademia.jpaacademia.repositories.IAlunoRepository;
import com.jpaacademia.jpaacademia.repositories.IAvaliacaoFisicaRepository;
import com.jpaacademia.jpaacademia.service.interfaces.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaService implements IAvaliacaoFisicaService {

    private final IAvaliacaoFisicaRepository avaliacaoFisicaRepository;
    private final IAlunoRepository alunoRepository;

    @Autowired
    public AvaliacaoFisicaService(IAvaliacaoFisicaRepository avaliacaoFisicaRepository, IAlunoRepository alunoRepository) {
        this.avaliacaoFisicaRepository = avaliacaoFisicaRepository;
        this.alunoRepository = alunoRepository;
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaDTO avaliacaoFisica) {

        AvaliacaoFisica novaAvaliacao = new AvaliacaoFisica();
        novaAvaliacao.setPeso(avaliacaoFisica.peso());
        novaAvaliacao.setAltura(avaliacaoFisica.altura());

        Aluno aluno = alunoRepository.findById(Long.parseLong(avaliacaoFisica.alunoId())).get();
        novaAvaliacao.setAluno(aluno);

        avaliacaoFisicaRepository.save(novaAvaliacao);

        return novaAvaliacao;
    }

    @Override
    public List<AvaliacaoFisica> getTodasAsAvaliacoesFisicas() {
        return avaliacaoFisicaRepository.findAll();
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @Override
    public AvaliacaoFisica buscarAvaliacaoFisicaPorId(Long id) {
        return avaliacaoFisicaRepository.findById(id).get();
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @Override
    public AvaliacaoFisica atualizarAvaliacaoFisica(Long id, AvaliacaoFisicaDTO avaliacaoFisica) {
        AvaliacaoFisica avaliacaoAtualizada = avaliacaoFisicaRepository.findById(id).get();
        avaliacaoAtualizada.setPeso(avaliacaoFisica.peso());
        avaliacaoAtualizada.setAltura(avaliacaoFisica.altura());

        avaliacaoFisicaRepository.save(avaliacaoAtualizada);

        return avaliacaoAtualizada;
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @Override
    public AvaliacaoFisica deletarAvaliacaoFisica(Long id) {
        return avaliacaoFisicaRepository.findById(id).get();
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @Override
    public List<AvaliacaoFisica>todasAsAvaliacoesFisicasPorAluno(Long idAluno) {
        Aluno aluno = alunoRepository.findById(idAluno).get();

        return aluno.getAvaliacoes();
    }
}

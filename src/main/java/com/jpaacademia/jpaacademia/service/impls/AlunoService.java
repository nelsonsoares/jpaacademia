package com.jpaacademia.jpaacademia.service.impls;

import com.jpaacademia.jpaacademia.dtos.AlunoDTO;
import com.jpaacademia.jpaacademia.models.Aluno;
import com.jpaacademia.jpaacademia.repositories.IAlunoRepository;
import com.jpaacademia.jpaacademia.service.interfaces.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService implements IAlunoService {

    private final IAlunoRepository alunoRepository;

    @Autowired
    public AlunoService(IAlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public Aluno create(AlunoDTO aluno) {
        Aluno novoAluno = new Aluno();
        novoAluno.setNome(aluno.nome());
        novoAluno.setCpf(aluno.cpf());
        novoAluno.setBairro(aluno.bairro());
        novoAluno.setDataNascimento(aluno.dataNascimento());

        return alunoRepository.save(novoAluno);
    }

    @Override
    public List<Aluno> getTodosOsAlunos() {
        return alunoRepository.findAll();
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @Override
    public Aluno buscarAlunoPorId(Long id) {
        return alunoRepository.findById(id).get();
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @Override
    public Aluno deletarAluno(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();
        alunoRepository.delete(aluno);
        return aluno;
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @Override
    public Aluno atualizarAluno(Long idAluno, AlunoDTO aluno) {
        Aluno alunoAtualizado = alunoRepository.findById(idAluno).get();
        alunoAtualizado.setNome(aluno.nome());
        alunoAtualizado.setCpf(aluno.cpf());
        alunoAtualizado.setBairro(aluno.bairro());
        alunoAtualizado.setDataNascimento(aluno.dataNascimento());

        alunoRepository.save(alunoAtualizado);
        return alunoAtualizado;
    }
}

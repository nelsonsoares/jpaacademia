package com.jpaacademia.jpaacademia.service.impls;

import com.jpaacademia.jpaacademia.models.Aluno;
import com.jpaacademia.jpaacademia.models.Matricula;
import com.jpaacademia.jpaacademia.repositories.IAlunoRepository;
import com.jpaacademia.jpaacademia.repositories.IMatriculaRespository;
import com.jpaacademia.jpaacademia.service.interfaces.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("OptionalGetWithoutIsPresent")
public class MatriculaService implements IMatriculaService {

    private final IMatriculaRespository matriculaRespository;
    private final IAlunoRepository alunoRepository;

    @Autowired
    public MatriculaService(IMatriculaRespository matriculaRespository, IAlunoRepository alunoRepository) {
        this.matriculaRespository = matriculaRespository;
        this.alunoRepository = alunoRepository;
    }

    @Override
    public Matricula create(Long id) {

        Aluno aluno = alunoRepository.findById(id).get();

        Matricula novaMatricula = new Matricula();
        novaMatricula.setAluno(aluno);

        return matriculaRespository.save(novaMatricula);
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRespository.findAll();
    }

    @Override
    public Matricula buscarPorId(Long id) {
        return matriculaRespository.findById(id).get();
    }

    @Override
    public Matricula deletarPorId(Long id) {
        Matricula matricula = matriculaRespository.findById(id).get();
        matriculaRespository.delete(matricula);
        return matricula;
    }

    @Override
    public Matricula atualizarPorId(Long id, Matricula matricula) {
        Matricula matriculaAtualizada = matriculaRespository.findById(id).get();
        matriculaAtualizada.setAluno(matricula.getAluno());
        matriculaRespository.save(matriculaAtualizada);
        return matricula;
    }
}

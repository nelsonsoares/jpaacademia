package com.jpaacademia.jpaacademia.repositories;

import com.jpaacademia.jpaacademia.models.Aluno;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlunoRepository extends ListCrudRepository<Aluno, Long> {
}

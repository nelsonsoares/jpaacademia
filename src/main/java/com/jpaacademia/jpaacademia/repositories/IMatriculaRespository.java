package com.jpaacademia.jpaacademia.repositories;

import com.jpaacademia.jpaacademia.models.Matricula;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMatriculaRespository extends ListCrudRepository<Matricula, Long> {
}

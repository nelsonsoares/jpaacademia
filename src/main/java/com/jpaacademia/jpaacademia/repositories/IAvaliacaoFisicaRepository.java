package com.jpaacademia.jpaacademia.repositories;

import com.jpaacademia.jpaacademia.models.AvaliacaoFisica;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAvaliacaoFisicaRepository extends ListCrudRepository<AvaliacaoFisica, Long> {
}

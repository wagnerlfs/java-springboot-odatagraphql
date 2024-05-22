package br.com.mrs.integracao.odatagraphql.repository;

import br.com.mrs.integracao.odatagraphql.entity.Patio;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;


public interface IPatioRepository extends Repository<Patio, Integer> {

    void saveAndFlush(Patio patio);

    Optional<Patio> findById(Integer id);

    List<Patio> findByNomeContainingIgnoreCaseOrderByNomeAsc(String nome);

    List<Patio> findAll();


}

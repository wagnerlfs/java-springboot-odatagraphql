package br.com.mrs.integracao.odatagraphql.repository;

import br.com.mrs.integracao.odatagraphql.entity.Previsibilidade;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPrevisibilidadeRepository extends MongoRepository<Previsibilidade, String> {

}

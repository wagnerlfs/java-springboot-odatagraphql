package br.com.mrs.integracao.odatagraphql.graphql;

import br.com.mrs.integracao.odatagraphql.entity.Previsibilidade;
import graphql.kickstart.annotations.GraphQLMutationResolver;
import graphql.kickstart.annotations.GraphQLQueryResolver;

import java.util.List;

public interface IPrevisibilidadeGraphQL extends GraphQLQueryResolver, GraphQLMutationResolver
{
    Previsibilidade FindById(String id);
    Previsibilidade FindByIdVeiculo(String idveiculo) ;
    List<Previsibilidade> Previsibilidades();

    Previsibilidade savePrevisibilidade(Previsibilidade previsibilidadeInput);
    Previsibilidade updatePrevisibilidade(String id, Previsibilidade previsibilidadeIput);
}

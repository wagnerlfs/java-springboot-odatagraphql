package br.com.mrs.integracao.odatagraphql.graphql;

import br.com.mrs.integracao.odatagraphql.entity.Patio;
import graphql.kickstart.annotations.GraphQLMutationResolver;
import graphql.kickstart.annotations.GraphQLQueryResolver;

import java.util.List;

public interface IPatioGraphQL extends GraphQLQueryResolver, GraphQLMutationResolver
{
    Patio ByID(int id);

    List<Patio> patios();

    Patio patios(Long id);

    Patio savePatio(Patio patio);

    Patio updatePatio(int id, Patio patio);

}

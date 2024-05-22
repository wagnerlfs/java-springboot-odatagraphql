package br.com.mrs.integracao.odatagraphql.resolver;

import br.com.mrs.integracao.odatagraphql.entity.Patio;
import br.com.mrs.integracao.odatagraphql.service.PatioService;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PatioResolver implements GraphQLResolver<Patio> {

    @Autowired
    private PatioService patioService;

    public Patio ByID(int id) {
        return patioService.findById(id);
    }

    public List<Patio> patios() {
        return patioService.findAll();
    }

    public Patio patios(Long id) {
        return null;
    }

    public Patio savePatio(Patio patio) {
        return null;
    }

    public Patio updatePatio(int id, Patio patio) {
        return null;
    }
}

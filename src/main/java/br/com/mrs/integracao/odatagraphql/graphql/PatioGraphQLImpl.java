package br.com.mrs.integracao.odatagraphql.graphql;

import br.com.mrs.integracao.odatagraphql.entity.Patio;
import br.com.mrs.integracao.odatagraphql.service.PatioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.List;

@Component
public class PatioGraphQLImpl implements IPatioGraphQL {

    @Autowired
    private PatioService patioService;

    @Override
    public Patio ByID(int id) {
        return patioService.findById(id);
    }

    @Override
    public List<Patio> patios() {
        return patioService.findAll();
    }

    @Override
    public Patio patios(Long id) {
        return patioService.findById(id.intValue());
    }

    @Override
    public Patio savePatio(Patio patio) {
        return new Patio();
    }

    @Override
    public Patio updatePatio(int id, Patio patio) {
        return new Patio();
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

package br.com.mrs.integracao.odatagraphql.graphql;

import br.com.mrs.integracao.odatagraphql.entity.Previsibilidade;
import br.com.mrs.integracao.odatagraphql.service.PrevisibilidadeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.Annotation;
import java.util.List;

public class PrevisibilidadeGraphQLImpl implements IPrevisibilidadeGraphQL{

    @Autowired
    private PrevisibilidadeService previsibilidadeService;

    @Override
    public Previsibilidade FindById(String id) {
        return previsibilidadeService.findById(id);
    }

    @Override
    public Previsibilidade FindByIdVeiculo(String idveiculo) {
        return previsibilidadeService.findByID_VEIC(idveiculo);
    }

    @Override
    public List<Previsibilidade> Previsibilidades() {
        return previsibilidadeService.findAll();
    }

    @Override
    public Previsibilidade savePrevisibilidade(Previsibilidade previsibilidadeInput) {
        return null;
    }

    @Override
    public Previsibilidade updatePrevisibilidade(String id, Previsibilidade previsibilidadeIput) {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

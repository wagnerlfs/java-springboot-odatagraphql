package br.com.mrs.integracao.odatagraphql.controller;

import br.com.mrs.integracao.odatagraphql.entity.Patio;
import br.com.mrs.integracao.odatagraphql.entity.Previsibilidade;
import br.com.mrs.integracao.odatagraphql.service.PatioService;
import br.com.mrs.integracao.odatagraphql.service.PrevisibilidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;

@Controller
public class OGraphQLController {

    @Autowired
    private PatioService patioService;

    @Autowired
    private PrevisibilidadeService previsibilidadeService;

    @QueryMapping("ByID")
    public Patio ByID(@Argument int id) {
        return patioService.findById(id);
    }

    @QueryMapping("patios")
    public List<Patio> Patios() {
        return patioService.findAll();
    }

    @QueryMapping("Previsibilidades")
    public ResponseEntity<List<Previsibilidade>> Previsibilidades() {
        List<Previsibilidade> listaPrevisibilidades = previsibilidadeService.findAll();

        if(Objects.nonNull(listaPrevisibilidades)){
            return ResponseEntity.ok(listaPrevisibilidades);
        }else{
            return ResponseEntity.noContent().build();
        }
    }
}

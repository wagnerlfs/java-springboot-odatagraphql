package br.com.mrs.integracao.odatagraphql.controller;

import br.com.mrs.integracao.odatagraphql.entity.Patio;
import br.com.mrs.integracao.odatagraphql.service.PatioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OGraphQLController {

    @Autowired
    private PatioService patioService;

    @QueryMapping("ByID")
    public Patio ByID(@Argument int id) {
        return patioService.findById(id);
    }

    @QueryMapping("patios")
    public List<Patio> Patios() {
        return patioService.findAll();
    }
}

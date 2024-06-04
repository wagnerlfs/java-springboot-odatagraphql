package br.com.mrs.integracao.odatagraphql.service;

import br.com.mrs.integracao.odatagraphql.entity.Previsibilidade;
import br.com.mrs.integracao.odatagraphql.repository.IPrevisibilidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrevisibilidadeService {

    @Autowired
    private IPrevisibilidadeRepository previsibilidadeRepository;

    public List<Previsibilidade> findAll()
    {
        return previsibilidadeRepository.findAll();
    }

    public Previsibilidade findById(String id)
    {
        Optional<Previsibilidade> previsibilidade = previsibilidadeRepository.findById(id);

        if (previsibilidade.isPresent()){
            return previsibilidade.get();
        }

        return null;
    }

    public Previsibilidade findByID_VEIC(String idVeiculo)
    {
        Optional<Previsibilidade> previsibilidade = previsibilidadeRepository.findById(idVeiculo);

        if (previsibilidade.isPresent()){
            return previsibilidade.get();
        }

        return null;
    }




}

package br.com.mrs.integracao.odatagraphql.service;

import br.com.mrs.integracao.odatagraphql.entity.Patio;
import br.com.mrs.integracao.odatagraphql.repository.IPatioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatioService {

    @Autowired
    private IPatioRepository patioRepository;


    public List<Patio> findAll(){
        return patioRepository.findAll();
    }

    public Patio findById(int id){
        Optional<Patio> optionalPatio = patioRepository.findById(id);

        if(optionalPatio.isPresent()){
            return optionalPatio.get();
        }

        return null;

    }
}

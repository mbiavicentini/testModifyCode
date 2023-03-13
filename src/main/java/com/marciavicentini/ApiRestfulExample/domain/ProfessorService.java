package com.marciavicentini.ApiRestfulExample.domain;

import com.marciavicentini.ApiRestfulExample.dto.ProfessorDTO;
import com.marciavicentini.ApiRestfulExample.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    public Professor findById(String i) {
        Optional<Professor> obj = professorRepository.findById(i);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Professor não encontrado!"));
    }

    public Professor adicionaNovoProfessor(Professor obj) {
        return professorRepository.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        professorRepository.deleteById(id);
    }

    public Professor alteraProfessor(Professor obj){

        Professor newObj = findById(obj.getId());
        newObj.setName(obj.getName());
        newObj.setArea(obj.getArea());
        newObj.setAnoAdmissao(obj.getAnoAdmissao());
        newObj.setFormacao(obj.getFormacao());
        newObj.setCpf(obj.getCpf());
        newObj.setDataNascimento(obj.getDataNascimento());
        newObj.setCelular(obj.getCelular());
        newObj.setId(obj.getId());

        return null;
    }

}

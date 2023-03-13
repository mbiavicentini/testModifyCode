package com.marciavicentini.ApiRestfulExample.domain;

import com.marciavicentini.ApiRestfulExample.dto.ProfessorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.marciavicentini.ApiRestfulExample.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/busca")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @Autowired
    private ProfessorRepository professorRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> findById(@PathVariable String id) {
        Optional<Professor> professor = professorRepository.findById(id);

        return ResponseEntity.badRequest().body(professor);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ResponseEntity<List<Professor>> findAll() {
        List<Professor> professor = professorService.findAll();

        return ResponseEntity.badRequest().body(professor);
    }

    @PostMapping
    public ResponseEntity<Professor> insert(@RequestBody ProfessorDTO professorDTO) {

       Professor obj = new Professor(professorDTO.getN(), professorDTO.getCpf(), professorDTO.getDataNascimento(), professorDTO.getCelular(),
                professorDTO.getFormacao(), professorDTO.getArea(), professorDTO.getAnoAdmissao());

        Professor ob2 = professorService.adicionaNovoProfessor(obj);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ob2);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable String id) {
        professorService.delete(id);

        return ResponseEntity.badRequest().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody ProfessorDTO newObj, @PathVariable String id) {

        return ResponseEntity.noContent().build();
    }
}

package com.marciavicentini.ApiRestfulExample.config;

import com.marciavicentini.ApiRestfulExample.domain.Professor;
import com.marciavicentini.ApiRestfulExample.domain.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

@Configuration
public class Instancias implements CommandLineRunner {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        professorRepository.deleteAll();

        Professor adriano = new Professor("Adriano", "1111", new Date(2001,01,01), "1111", "Faculdade 1", "Matematica", "2020");
        Professor bruna = new Professor("Bruna", "2222", new Date(1999,10,02), "2222", "Faculdade 2", "Portugues", "2019");
        Professor lais = new Professor("Lais", "3333", new Date(1993,03,07), "3333", "Faculdade 3", "Historia", "2012");

        professorRepository.saveAll(Arrays.asList(adriano, bruna, lais));

    }
}

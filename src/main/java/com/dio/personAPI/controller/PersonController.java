package com.dio.personAPI.controller;

import com.dio.personAPI.dto.MessageResponseDTO;
import com.dio.personAPI.entity.Person;
import com.dio.personAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;

    @Autowired // Injeta uma implementação do tipo PersonRepository
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping //Mapeia esse metódo para o acesso do HTTP METHOD POST
    public MessageResponseDTO createPerson(@RequestBody Person person){ //Informa que tá vindo uma requisição do tipo pessoa
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}

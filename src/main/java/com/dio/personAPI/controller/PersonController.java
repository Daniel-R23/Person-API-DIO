package com.dio.personAPI.controller;

import com.dio.personAPI.dto.request.PersonDTO;
import com.dio.personAPI.dto.response.MessageResponseDTO;
import com.dio.personAPI.entity.Person;
import com.dio.personAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping //Mapeia esse metódo para o acesso do HTTP METHOD POST
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) { //Informa que tá vindo uma requisição do tipo pessoa
        return personService.createPerson(personDTO);
    }
}

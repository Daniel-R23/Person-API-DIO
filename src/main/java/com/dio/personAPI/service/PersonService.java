package com.dio.personAPI.service;

import com.dio.personAPI.dto.MessageResponseDTO;
import com.dio.personAPI.entity.Person;
import com.dio.personAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Indica para o Spring gerenciar uma classe com todas as regras de negócio da nossa aplicação
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){ //Informa que tá vindo uma requisição do tipo pessoa
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}

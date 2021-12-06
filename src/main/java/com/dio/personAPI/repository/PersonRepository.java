package com.dio.personAPI.repository;

import com.dio.personAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> { //Entidade e tipo de dados do id <Person, Long>

}

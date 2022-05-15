package com.example.demo.services;


import com.example.demo.entities.Person;
import com.example.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    PersonRepository personRepository;


    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    public Iterable<Person> getAllReservations(){
        return personRepository.findAll();
    }

    public void deleteAllReservations(){
        personRepository.deleteAll();
    }

    public void deleteReservationById(String id){
        personRepository.deleteById(id);
    }

    public Optional<Person> findReservationById(String id){
        return personRepository.findById(id);
    }

}

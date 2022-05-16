package com.example.demo.controllers;

import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonsThymeleafController {

    private PersonService personService;

    @Autowired
    public PersonsThymeleafController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/persons-ui")
    public String persons(Model model){
        model.addAttribute("persons", personService.getAllPerson());
        return "persons";
    }
}

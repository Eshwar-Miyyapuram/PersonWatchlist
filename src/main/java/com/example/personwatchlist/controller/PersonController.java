package com.example.personwatchlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.personwatchlist.model.Person;
import com.example.personwatchlist.repository.PersonRepository;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository repository;


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("person", new Person());
        model.addAttribute("persons", repository.findAll());
        return "index";
    }


    @PostMapping("/add")
    public String addPerson(@ModelAttribute Person person) {
        repository.save(person);
        return "redirect:/";
    }
}

package com.example.app.person;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;


    @GetMapping("/add")
    public String showRegisterForm(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "personForm";
    }

    @PostMapping("/add")
    @ResponseBody
    public String add(Person person) {
        personService.add(person);
        return "added " + person.getId();
    }

}

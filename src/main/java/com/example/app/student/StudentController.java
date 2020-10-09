package com.example.app.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@AllArgsConstructor
@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/add")
    public String showRegisterForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("countries");
        model.addAttribute("skills");
        model.addAttribute("hobbies");
        return "studentForm";
    }

    @PostMapping("/add")
    @ResponseBody
    public String add(Student student) {
        return student.toString();
    }

    @ModelAttribute("countries")
    public List<String> countries() {
        return Arrays.asList("Poland", "Germany", "France", "Russia", "Denmark");
    }

    @ModelAttribute("skills")
    public Collection<String> skills() {
        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("php");
        skills.add("python");
        skills.add("ruby");
        return skills;
    }

    @ModelAttribute("hobbies")
    public List<String> hobbies() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("reading");
        hobbies.add("sleeping");
        return hobbies;
    }


}

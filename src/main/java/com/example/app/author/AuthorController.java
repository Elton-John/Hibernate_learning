package com.example.app.author;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping("/add")
    @ResponseBody
    public String add(){
        Author author = authorService.add();
        return String.format("author (id = %d) added", author.getId());
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String findById(@PathVariable Long id){
        Author author = authorService.findById(id);
        return author.toString();
    }

    @GetMapping("/update/{id}/{lastName}")
    @ResponseBody
    public String update(@PathVariable Long id, @PathVariable String lastName){
        Author author = authorService.update(id, lastName);
        return String.format("author (id = %d) updated", author.getId());
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable Long id){
        authorService.delete(id);
        return "deleted";
    }
}

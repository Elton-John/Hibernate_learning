package com.example.app.author;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("author/form")
public class AuthorFormController {

    private final AuthorFormService authorFormService;

    @GetMapping("/add")
    public String showRegisterForm(Model model) {
        Author author = new Author();
        model.addAttribute("author", author);
        return "authorForm";
    }

    @PostMapping("/add")
    public String add(Author author) {
        authorFormService.add(author);
        return "redirect:/author/form/main";
    }

    @GetMapping("/main")
    public String mainPage(Model model) {
        List<Author> authors = authorFormService.findAll();
        model.addAttribute("authors", authors);
        return "authorMain";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Author author = authorFormService.findById(id);
        model.addAttribute("author", author);
        return "authorForm";
    }

    @PostMapping("edit/{id}")
    public String edit(@PathVariable Long id, Author author) {
        authorFormService.update(id, author);
        return "redirect:/author/form/main";
    }

    @GetMapping("/delete/submit/{id}")
    public String submitDeleting(@PathVariable Long id, Model model) {
        Author authorToDelete = authorFormService.findById(id);
        model.addAttribute("author", authorToDelete);
        model.addAttribute("id", id);
        return "authorSubmitDelete";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        authorFormService.delete(id);
        return "redirect:/author/form/main";
    }
}

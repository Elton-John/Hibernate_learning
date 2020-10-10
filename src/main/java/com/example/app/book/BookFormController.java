package com.example.app.book;

import com.example.app.author.Author;
import com.example.app.author.AuthorService;
import com.example.app.publisher.Publisher;
import com.example.app.publisher.PublisherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/book/form")
public class BookFormController {

    private final BookFormService bookFormService;
    private final PublisherService publisherService;
    private final AuthorService authorService;


    @GetMapping("/main")
    public String mainPage(Model model) {
        List<Book> books = bookFormService.findAll();
        model.addAttribute("books", books);
        return "bookMain";
    }

    @GetMapping("/add")
    public String showRegisterForm(Model model) {
        Book book = new Book();
        model.addAttribute(book);
        model.addAttribute("publishers");
        model.addAttribute("authors");
        return "bookForm";
    }

    @PostMapping("/add")
    public String add(Book book) {
        bookFormService.add(book);
        return "redirect:/book/form/main";
    }

    @GetMapping("/edit/{id}")
    public String showEditionForm(@PathVariable Long id, Model model) {
        Book book = bookFormService.findById(id);
        model.addAttribute("book", book);
        model.addAttribute("publishers");
        return "bookEdit";
    }

    @PostMapping("/edit/{id}")
    public String edit(Book book) {
        bookFormService.update(book);
        return "redirect:/book/form/main";
    }

    @GetMapping("/delete/submit/{id}")
    public String showSubmitDeletingForm(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        return "bookSubmitDelete";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        bookFormService.delete(id);
        return "redirect:/book/form/main";
    }

    @ModelAttribute("publishers")
    public List<Publisher> publishers() {
        return publisherService.findAll();
    }

    @ModelAttribute("authors")
    public List<Author> authors() {
        return authorService.findAll();
    }

}

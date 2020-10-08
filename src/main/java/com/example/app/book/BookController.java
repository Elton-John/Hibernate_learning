package com.example.app.book;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @GetMapping("/add")
    @ResponseBody
    public String add(){
        Book book = bookService.add();
        return String.format("book (id = %d) added", book.getId());
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String findById(@PathVariable Long id){
        Book book = bookService.findById(id);
        return book.toString();
    }

    @GetMapping("/update/{id}/{title}")
    @ResponseBody
    public String update(@PathVariable Long id, @PathVariable String title){
        Book book = bookService.update(id, title);
        return String.format("book (id = %d) updated", book.getId());
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable Long id){
        bookService.delete(id);
        return "deleted";
    }

    @GetMapping("/all")
    @ResponseBody
    public String findAll(){
        List<Book> books = bookService.findAll();
        return books.toString();
    }

}

package com.example.app.book;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

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

}

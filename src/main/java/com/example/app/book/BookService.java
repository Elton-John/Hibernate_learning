package com.example.app.book;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {
    private final BookDao bookDao;

    public Book add() {
        Book book = new Book();
        book.setTitle("nazwa");
        book.setRating(5);
        book.setDescription("opis książki");
        bookDao.saveBook(book);
        return book;
    }

    public Book findById(Long id) {
        return bookDao.findById(id);
    }
}

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

    public Book update(Long id, String title){
        Book book = bookDao.findById(id);
        book.setTitle(title);
        bookDao.update(book);
        return book;
    }

    public void delete(Long id){
        Book book = bookDao.findById(id);
        bookDao.delete(book);
    }
}

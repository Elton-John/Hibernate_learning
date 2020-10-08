package com.example.app.book;

import com.example.app.publisher.Publisher;
import com.example.app.publisher.PublisherDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {
    private final BookDao bookDao;
    private final PublisherDao publisherDao;

    public Book add() {
        Book book = new Book();
        book.setTitle("nazwa");
        book.setRating(5);
        book.setDescription("opis książki");
        Publisher publisher = new Publisher();
        publisher.setName("nazwa wydawnictwa");
        publisherDao.savePublisher(publisher);
        book.setPublisher(publisher);
        bookDao.saveBook(book);
        return book;
    }

    public Book findById(Long id) {
        return bookDao.findById(id);
    }

    public Book update(Long id, String title) {
        Book book = bookDao.findById(id);
        book.setTitle(title);
        bookDao.update(book);
        return book;
    }

    public void delete(Long id) {
        Book book = bookDao.findById(id);
        bookDao.delete(book);
    }
}

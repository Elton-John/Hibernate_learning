package com.example.app.book;

import com.example.app.author.Author;
import com.example.app.author.AuthorDao;
import com.example.app.publisher.Publisher;
import com.example.app.publisher.PublisherDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {
    private final BookDao bookDao;
    private final PublisherDao publisherDao;
    private final AuthorDao authorDao;

    public Book add() {
        Book book = new Book();
        book.setTitle("nazwa");
        book.setRating(5);
        book.setDescription("opis książki");
        Publisher publisher = new Publisher();
        publisher.setName("nazwa wydawnictwa");
        publisherDao.savePublisher(publisher);
        book.setPublisher(publisher);
        Author author1 = authorDao.findById(1L);
        Author author2 = authorDao.findById(2L);
        book.getAuthorList().add(author1);
        book.getAuthorList().add(author2);


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

    public List<Book> findAll() {
        return bookDao.findAll();
    }

    public List<Book> getRatingList(int rating) {
        return bookDao.getRatingList(rating);
    }

    public List<Book> getBooksWithPublisher() {
        return bookDao.getBooksWithPublisher();
    }

    public List<Book> getBooksByPublisherId(Long id) {
        return bookDao.getBooksByPublisherId(id);
    }

    public List<Book> getBooksByAuthorId(Long id) {
        return bookDao.getBooksByAuthorId(id);
    }
}

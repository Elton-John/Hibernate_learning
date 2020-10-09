package com.example.app.book;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class BookDao {
    @PersistenceContext
    EntityManager entityManager;

    public void saveBook(Book book) {
        entityManager.persist(book);
    }

    public Book findById(Long id) {
        return entityManager.find(Book.class, id);
    }

    public void update(Book book) {
        entityManager.merge(book);
    }

    public void delete(Book book) {
        entityManager.remove(entityManager.contains(book) ?
                book : entityManager.merge(book));
    }

    public List<Book> findAll() {
        Query query = entityManager.createQuery("SELECT b from Book b");
        return query.getResultList();
    }

    public List<Book> getRatingList(int rating) {
        Query query = entityManager.createQuery("SELECT b FROM Book b WHERE b.rating>:rating");
        query.setParameter("rating", rating);
        return query.getResultList();
    }

//    Uzupełnij klasę BookDao o metodę do pobierania listy
//    wszystkich książek, które mają jakiegokolwiek wydawcę.

    public List<Book> getBooksWithPublisher() {
        Query query = entityManager.createQuery("SELECT b FROM Book b JOIN b.publisher ");
        return query.getResultList();
    }

//    Uzupełnij klasę BookDao o metodę do pobierania listy
//    wszystkich książek, które mają określonego w parametrze wydawcę.


    public List<Book> getBooksByPublisherId(Long id) {
        Query query = entityManager.createQuery("SELECT b FROM Book b JOIN b.publisher WHERE b.publisher.id =:id");
        query.setParameter("id", id);
        return query.getResultList();
    }
//    Uzupełnij klasę BookDao o metodę do pobierania listy
//    wszystkich książek, które mają określonego w parametrze autora.

    public List<Book> getBooksByAuthorId(Long id) {
        Query query = entityManager.createQuery("SELECT b FROM Book b JOIN b.authorList authorList where authorList.id=:id");
        query.setParameter("id", id);
        return query.getResultList();

    }

}

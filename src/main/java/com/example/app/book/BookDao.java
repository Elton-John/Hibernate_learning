package com.example.app.book;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class BookDao {
    @PersistenceContext
    EntityManager entityManager;

    public void saveBook (Book book){
        entityManager.persist(book);
    }

    public Book findById(Long id){
       return entityManager.find(Book.class, id);
    }
}

package com.example.app.person;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional

public class PersonDao {
    @PersistenceContext
    EntityManager entityManager;

    public Person add(Person person){
        entityManager.persist(person);
        return person;
    }
}

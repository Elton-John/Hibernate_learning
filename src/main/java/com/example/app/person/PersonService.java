package com.example.app.person;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonService {
    private final PersonDao personDao;

//    public Person add(String login, String password) {
//        Person person = new Person();
//        person.setLogin(login);
//        person.setPassword(password);
//        personDao.add(person);
//        return person;
//    }

    public Person add(Person person) {
        personDao.add(person);
        return person;
    }
}

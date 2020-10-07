package com.example.app.author;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorDao authorDao;

    public Author add() { Author author = new Author();
        author.setFirstName("Imię autora");
        author.setLastName("Nazwisko");
               authorDao.saveAuthor(author);
        return author;
    }

    public Author findById(Long id) {
        return authorDao.findById(id);
    }

    public Author update(Long id, String lastName){
        Author author = authorDao.findById(id);
        author.setLastName(lastName);
        authorDao.update(author);
        return author;
    }

    public void delete(Long id){
        Author author = authorDao.findById(id);
        authorDao.delete(author);
    }
}

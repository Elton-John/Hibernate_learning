package com.example.app.author;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorFormService {
    private final AuthorDao authorDao;

    public Author add(Author author) {
        authorDao.saveAuthor(author);
        return author;
    }

    public Author findById(Long id) {
        return authorDao.findById(id);
    }

    public Author update(Long id, Author author) {
        authorDao.update(author);
        return author;
    }

    public void delete(Long id) {
        Author author = authorDao.findById(id);
        authorDao.delete(author);
    }

    public List<Author> findAll() {
        return authorDao.findAll();

    }

}

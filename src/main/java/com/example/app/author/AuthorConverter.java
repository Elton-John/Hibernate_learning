package com.example.app.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class AuthorConverter implements Converter<String, Author> {
    @Autowired
    AuthorService authorService;

    @Override
    public Author convert(String sourse) {
        return authorService.findById(Long.parseLong(sourse));
    }
}

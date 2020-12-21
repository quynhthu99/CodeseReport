package com.example.lesson22.service;

import com.example.lesson22.entity.Author;
import com.example.lesson22.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    public Author addAuthor(Author author){
       return authorRepository.save(author);
    }
}

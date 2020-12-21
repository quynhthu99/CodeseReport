package com.example.demo.service;

import com.example.demo.entity.Author;
import com.example.demo.reponsitory.AuthorReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorReponsitory authorReponsitory;

    public Author saveAuthor(Author author) {
        return authorReponsitory.save(author);
    }

    public List<Author> findAllAuthor() {
        return authorReponsitory.findAll();

    }

    public Author findAuthorById(int id){
        return authorReponsitory.findById(id).orElse(null);
    }

    public void deleteAuthorById(int id){
        authorReponsitory.deleteById(id);

    }
}

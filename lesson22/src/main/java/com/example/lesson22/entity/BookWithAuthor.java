package com.example.lesson22.entity;

import com.example.lesson22.entity.Book;

public class BookWithAuthor {
    private Book book;
    private Long id;

    public BookWithAuthor() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

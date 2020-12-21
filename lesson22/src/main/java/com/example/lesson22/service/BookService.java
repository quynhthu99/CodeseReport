package com.example.lesson22.service;

import com.example.lesson22.entity.Book;
import com.example.lesson22.repository.AuthorRepository;
import com.example.lesson22.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public Book addBook(Book book, Long id) {
        book.setAuthor(authorRepository.findById(id).get());
        return bookRepository.save(book);
    }

    public Book updateBook(Book book, Long id) {
        if (bookRepository.findById(book.getId()) != null) {
            book.setAuthor(authorRepository.findById(id).get());
            return bookRepository.save(book);

        }
        return null;
    }

    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}


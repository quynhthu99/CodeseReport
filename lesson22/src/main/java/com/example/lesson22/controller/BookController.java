package com.example.lesson22.controller;

import com.example.lesson22.entity.BookWithAuthor;
import com.example.lesson22.entity.Book;
import com.example.lesson22.service.AuthorService;
import com.example.lesson22.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    private final BookService bookService;
    private final AuthorService authorService;

    public BookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @RequestMapping(value = "/create-book", method = RequestMethod.POST)
    public Book createBook(@RequestBody BookWithAuthor bookWithAuthor) {

        return bookService.addBook(bookWithAuthor.getBook(), bookWithAuthor.getId());
    }

//    @RequestMapping(value = "/update-book", method = RequestMethod.PUT)
//    public Book updateBook(@RequestBody Book book) {
//        if (bookRepository.findById(book.getId()).isPresent()) {
//            return bookRepository.save(book);
//        }
//        return null;
//
//    }
//
//    public void deleteBook(long id) {
//        bookRepository.deleteById(id);
//    }
//
//    public List<Book> getAllBooks() {
//        return bookRepository.findAll();
//    }

}


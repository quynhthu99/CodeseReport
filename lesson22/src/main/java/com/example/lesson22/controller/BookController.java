package com.example.lesson22.controller;

import com.example.lesson22.entity.BookWithAuthor;
import com.example.lesson22.entity.Book;
import com.example.lesson22.service.AuthorService;
import com.example.lesson22.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/update-book", method = RequestMethod.PUT)
    public Book updateBook(@RequestBody BookWithAuthor bookWithAuthor) {

        return bookService.updateBook(bookWithAuthor.getBook(),bookWithAuthor.getId());

    }
@RequestMapping(value = "/delete-book", method = RequestMethod.DELETE)
    public void deleteBook(@RequestParam(value = "id")  long id) {
        bookService.deleteBook(id);
    }

    @RequestMapping(value = "/get-all-book",method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

}


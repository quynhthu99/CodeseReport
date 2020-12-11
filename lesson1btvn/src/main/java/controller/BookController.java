package controller;

import dto.BookWithAuthorName;
import entity.Book;
import service.BookService;

import java.util.List;

public class BookController {
    BookService bookService = new BookService();

    public List<BookWithAuthorName> getAllBooks() {
        return bookService.getAllbooks();
    }

    public boolean addBook(Book book) {
        return bookService.addBook(book);
    }

    public boolean updateBook(Book book) {
        return bookService.updateBook(book);
    }

    public boolean deleteBook(int idBook) {
        return bookService.deleteBook(idBook);
    }
}

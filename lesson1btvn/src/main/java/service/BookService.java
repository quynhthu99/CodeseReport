package service;

import dto.BookWithAuthorName;
import entity.Book;
import repo.BookRepository;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public class BookService {
    BookRepository bookRepository = new BookRepository();

    public List<BookWithAuthorName> getAllbooks() {
        try {
            return bookRepository.getAllBooks();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public boolean addBook(Book book) {
        try {
            return bookRepository.addBook(book);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("khong tim thay idAuthor");
        }
        return false;
    }


    public boolean updateBook(Book book) {
        try {
            System.out.println(book.getIdBook());
            System.out.println(bookRepository.getBookById(book.getIdBook()));
            if (bookRepository.getBookById(book.getIdBook())) return bookRepository.updateBook(book);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    public boolean deleteBook(int idBook)  {
        try {
            if (bookRepository.getBookById(idBook)) return bookRepository.deleteBook(idBook);

            else return false;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}


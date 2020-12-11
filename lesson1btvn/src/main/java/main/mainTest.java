package main;

import entity.Book;
import helper.DatabaseUtils;
import repo.BookRepository;
import view.viewMain;

import java.sql.SQLException;

public class mainTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        viewMain viewMain = new viewMain();
        viewMain.viewMain();

    }
}

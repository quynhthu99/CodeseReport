package repo;

import dto.BookWithAuthorName;
import entity.Book;
import helper.DatabaseUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    DatabaseUtils databaseUtils = new DatabaseUtils();

    public List<BookWithAuthorName> getAllBooks() throws ClassNotFoundException, SQLException {

        String query = "select book.namebook, author.nameauthor from book inner join author on book.idauthor=author.idauthor";
        List<BookWithAuthorName> bookWithAuthorNames = new ArrayList<BookWithAuthorName>();
        PreparedStatement preparedStatement = databaseUtils.getConnection().prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            BookWithAuthorName bookWithAuthorName = new BookWithAuthorName(resultSet.getString(1), resultSet.getString(2));
            if (bookWithAuthorName != null) {
                bookWithAuthorNames.add(bookWithAuthorName);
            }
        }
        return bookWithAuthorNames;

    }

    public boolean addBook(Book book) throws SQLException, ClassNotFoundException {
        String sql = "insert into book( namebook, idauthor) values ( ?,?) ";
        PreparedStatement preparedStatement = databaseUtils.getConnection().prepareStatement(sql);
        preparedStatement.setString(1, book.getNameBook());
        preparedStatement.setInt(2, book.getIdAuthor());
        int result = preparedStatement.executeUpdate();
        System.out.println(result);
        return result > 0;
    }

    public boolean updateBook(Book book) throws ClassNotFoundException, SQLException {
        String sql = "update book set namebook = ?, idauthor = ? where idbook =?";
        PreparedStatement preparedStatement = databaseUtils.getConnection().prepareStatement(sql);
        preparedStatement.setString(1, book.getNameBook());
        preparedStatement.setInt(2, book.getIdAuthor());
        preparedStatement.setInt(3, book.getIdBook());
        int result = preparedStatement.executeUpdate();
        return result > 0;
    }

    public boolean deleteBook(int idBook) throws ClassNotFoundException, SQLException {
        String sql = "delete from book where idbook = ?";
        PreparedStatement preparedStatement = databaseUtils.getConnection().prepareStatement(sql);
        preparedStatement.setInt(1, idBook);
        int result = preparedStatement.executeUpdate();
        return result > 0;
    }
    public boolean getBookById(int idBook) throws ClassNotFoundException, SQLException {
        String sql="select * from book where idbook =?";
        PreparedStatement preparedStatement = databaseUtils.getConnection().prepareStatement(sql);
        preparedStatement.setInt(1, idBook);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            return true;
        }
        return false;
    }
}

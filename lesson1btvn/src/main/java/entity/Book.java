package entity;

public class Book {
    private int idBook;
    protected String nameBook ;
    private  int idAuthor;

    public Book() {
    }

    public Book( String nameBook, int idAuthor) {
        this.nameBook = nameBook;
        this.idAuthor = idAuthor;
    }

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }
}

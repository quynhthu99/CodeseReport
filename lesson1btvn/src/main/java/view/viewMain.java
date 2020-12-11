package view;

import controller.BookController;
import entity.Book;

import java.util.Scanner;

public class viewMain {
    public void viewMain(){
        BookController bookController = new BookController();
        while(true){
            System.out.println("Chon chuong trinh: ");
            System.out.println("1. Show all books");
            System.out.println("2. Add book");
            System.out.println("3. Update book");
            System.out.println("4. Delete book");
            System.out.println("5. Exit");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println(bookController.getAllBooks());
                    break;
                case 2:
                    System.out.println("Enter book add: ");
                    //System.out.println("book id: "); int id = sc.nextInt();
                    System.out.println("book name: "); String name = sc.next();
                    System.out.println("book author: "); int idAuthor = sc.nextInt();
                    Book book1 = new Book(name,idAuthor);
                    System.out.println(bookController.addBook(book1));
                    break;
                case 3:
                    System.out.println("Enter book update: ");
                    System.out.println("book id: "); int id1 = sc.nextInt();
                    System.out.println("book name: "); String name1 = sc.next();
                    System.out.println("book author: "); int idAuthor1 = sc.nextInt();
                    Book book2 = new Book(name1,idAuthor1);
                    book2.setIdBook(id1);
                    System.out.println(bookController.updateBook(book2));
                    break;
                case 4:
                    System.out.println("Enter id book delete: ");
                    int id =sc.nextInt();
                    System.out.println(bookController.deleteBook(id));
                    break;
                case 5:
                    break;
                default:
                    break;
            }
            if(n==5) break;
        }
    }
}

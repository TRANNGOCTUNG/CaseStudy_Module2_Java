package view;

import controller.manager.BookManager;
import controller.manager.UserBook;
import model.book.Book;
import model.book.BusinessBook;
import model.book.FictionBook;
import model.book.ProgramingBook;
import model.person.Person;
import read_write_file_singleton.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowBook {
    static List<Book> book = new ArrayList<>();
    static BookManager bookManager = new BookManager();
    static List<Person> persons = new ArrayList<>();
    static UserBook userBook = new UserBook();
    public static void main(String[] args) {
//       bookManager.display(book);
//        Scanner scanner = new Scanner(System.in);
//        bookManager.write();
//        ReadWriteFile.getINSTANCE().readFile("books.txt");
//        bookManager.getRealMoney();

      userBook.delete(persons,1);
        for (Person p:persons
             ) {
            System.out.println(p);
        }
    }
}

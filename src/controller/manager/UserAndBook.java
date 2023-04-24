package controller.manager;

import model.book.Book;
import model.book.BusinessBook;
import model.book.FictionBook;
import model.book.ProgramingBook;
import model.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserAndBook {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Book> books = new ArrayList<Book>();
    private static BookManager bookManager = new BookManager(books);
    private static List<Person> persons = new ArrayList<Person>();
    private static UserBook userBook = new UserBook(persons);
    public void show(){

    }
    public static Book bookAdd(){
        System.out.println("""
                Menu:
                1.Add FictionBook.
                2.Add ProgramingBook.
                3.Add BusinessBook.
                """);
        System.out.println("What class do you want to add? ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 ->{
                System.out.println("Enter id fictionBook: ");
                int id = scanner.nextInt();
                System.out.println("Enter title fictionBook: ");
                String title = scanner.nextLine();
                System.out.println("Enter author fictionBook: ");
                String author = scanner.next();
                System.out.println("Enter quantity fictionBook: ");
                int quantity = scanner.nextInt();
                System.out.println("Enter price fictionBook: ");
                double price = scanner.nextDouble();
                System.out.println("Enter category fictionBook: ");
                String category = scanner.nextLine();
                FictionBook fictionBook = new FictionBook(id, title, author, quantity, price, category);
                return fictionBook;
            }
            case 2 ->{
                System.out.println("Enter id programingBook : ");
                int id = scanner.nextInt();
                System.out.println("Enter title programingBook: ");
                String title = scanner.nextLine();
                System.out.println("Enter author programingBook: ");
                String author = scanner.next();
                System.out.println("Enter quantity programingBook: ");
                int quantity = scanner.nextInt();
                System.out.println("Enter price programingBook: ");
                double price = scanner.nextDouble();
                System.out.println("Enter language programingBook: ");
                String language = scanner.nextLine();
                ProgramingBook programingBook = new ProgramingBook(id, title, author, quantity, price, language);
                return programingBook;
            }
            case 3 ->{
                System.out.println("Enter id businessBook : ");
                int id = scanner.nextInt();
                System.out.println("Enter title businessBook: ");
                String title = scanner.nextLine();
                System.out.println("Enter author businessBook: ");
                String author = scanner.next();
                System.out.println("Enter quantity businessBook: ");
                int quantity = scanner.nextInt();
                System.out.println("Enter price businessBook: ");
                double price = scanner.nextDouble();
                System.out.println("Enter origin businessBook: ");
                String origin = scanner.nextLine();
                BusinessBook businessBook = new BusinessBook(id, title, author, quantity, price, origin);
                return businessBook;
            }
            default -> System.out.println("Can not find book: ");
        }
        return null;
    }
    public static Book editBook(){
        System.out.println("""
                Menu.
                1.Edit FictionBook.
                2.Edit ProgrammingBook.
                3.Edit BusinessBook.
                """);
        System.out.println("What class do you want to edit ");
        int choice =  scanner.nextInt();
        switch (choice){
            case 1 ->{
                System.out.println("Edit id fictionBook: ");
                int id = scanner.nextInt();
                System.out.println("Edit title fictionBook: ");
                String title = scanner.nextLine();
                System.out.println("Edit author fictionBook: ");
                String author = scanner.next();
                System.out.println("Edit quantity fictionBook: ");
                int quantity = scanner.nextInt();
                System.out.println("Edit price fictionBook: ");
                double price = scanner.nextDouble();
                System.out.println("Edit category fictionBook: ");
                String category = scanner.nextLine();
                FictionBook fictionBook = new FictionBook(id, title, author, quantity, price, category);
                return fictionBook;
            }
            case 2 -> {
                System.out.println("Edit id programingBook : ");
                int id = scanner.nextInt();
                System.out.println("Edit title programingBook: ");
                String title = scanner.nextLine();
                System.out.println("Edit author programingBook: ");
                String author = scanner.next();
                System.out.println("Edit quantity programingBook: ");
                int quantity = scanner.nextInt();
                System.out.println("Edit price programingBook: ");
                double price = scanner.nextDouble();
                System.out.println("Edit language programingBook: ");
                String language = scanner.nextLine();
                ProgramingBook programingBook = new ProgramingBook(id, title, author, quantity, price, language);
                return programingBook;
            }
            case 3->{
                System.out.println("Edit id businessBook : ");
                int id = scanner.nextInt();
                System.out.println("Edit title businessBook: ");
                String title = scanner.nextLine();
                System.out.println("Edit author businessBook: ");
                String author = scanner.next();
                System.out.println("Edit quantity businessBook: ");
                int quantity = scanner.nextInt();
                System.out.println("Edit price businessBook: ");
                double price = scanner.nextDouble();
                System.out.println("Edit origin businessBook: ");
                String origin = scanner.nextLine();
                BusinessBook businessBook = new BusinessBook(id, title, author, quantity, price, origin);
                return businessBook;
            }
            default -> System.out.println("Can not find book: ");
        }
        return null;
    }
    public static Book insertBook(){
        System.out.println("""
                Menu:
                1.Insert FictionBook.
                2.Insert ProgrammingBook.
                3.Insert BusinessBook.
                """);
        System.out.println("What class do you want to insert");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1 -> {
                System.out.println("Insert id fictionBook: ");
                int id = scanner.nextInt();
                System.out.println("Insert title fictionBook: ");
                String title = scanner.nextLine();
                System.out.println("Insert author fictionBook: ");
                String author = scanner.next();
                System.out.println("Insert quantity fictionBook: ");
                int quantity = scanner.nextInt();
                System.out.println("Insert price fictionBook: ");
                double price = scanner.nextDouble();
                System.out.println("Insert category fictionBook: ");
                String category = scanner.nextLine();
                FictionBook fictionBook = new FictionBook(id, title, author, quantity, price, category);
                return fictionBook;
            }
            case 2 -> {
                System.out.println("Insert id programingBook : ");
                int id = scanner.nextInt();
                System.out.println("Insert title programingBook: ");
                String title = scanner.nextLine();
                System.out.println("Insert author programingBook: ");
                String author = scanner.next();
                System.out.println("Insert quantity programingBook: ");
                int quantity = scanner.nextInt();
                System.out.println("Insert price programingBook: ");
                double price = scanner.nextDouble();
                System.out.println("Insert language programingBook: ");
                String language = scanner.nextLine();
                ProgramingBook programingBook = new ProgramingBook(id, title, author, quantity, price, language);
                return programingBook;
            }
            case 3 ->{
                System.out.println("Insert id businessBook : ");
                int id = scanner.nextInt();
                System.out.println("Insert title businessBook: ");
                String title = scanner.nextLine();
                System.out.println("Insert author businessBook: ");
                String author = scanner.next();
                System.out.println("Insert quantity businessBook: ");
                int quantity = scanner.nextInt();
                System.out.println("Insert price businessBook: ");
                double price = scanner.nextDouble();
                System.out.println("Insert origin businessBook: ");
                String origin = scanner.nextLine();
                BusinessBook businessBook = new BusinessBook(id, title, author, quantity, price, origin);
                return businessBook;
            }
            default -> System.out.println("Can not find book: ");
        }
        return null;
    }
}

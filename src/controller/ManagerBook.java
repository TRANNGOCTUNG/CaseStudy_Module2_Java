package controller;

import model.Interface.CRUD;
import model.book.Book;
import model.book.FictionBook;
import model.book.ProgramingBook;

import java.util.ArrayList;
import java.util.List;

public class ManagerBook{
    public List<Book> books;

    public ManagerBook() {
        books = new ArrayList<Book>();
        books.add(new FictionBook("Đỏ trỗi dậy","Lê Đình Chi",20,102.000,"English"));
        books.add(new FictionBook("Hai vạn dặm dưới đáy biện","Jules Verne",15,81.600,"Tiếng Việt"));
        books.add(new FictionBook("Người minh họa","Ray Bradbury",10,100.000,"English"));
        books.add(new ProgramingBook("Think Java","Chris Mayfiled",30,400.000,"Java"));
        books.add(new ProgramingBook("Think Java","Chris Mayfiled",30,400.000));
        books.add(new ProgramingBook("Think Java","Chris Mayfiled",30,400.000));

    }
}

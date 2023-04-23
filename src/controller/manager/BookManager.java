package controller.manager;

import model.Interface.CRUD;
import model.Interface.InUpSort;
import model.Interface.RealMoney;
import model.book.Book;
import model.book.BusinessBook;
import model.book.FictionBook;
import model.book.ProgramingBook;
import read_write_file_singleton.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;

public class BookManager implements CRUD<BookManager>,InUpSort<BookManager>,RealMoney {
    public List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
        books.add(new FictionBook(1,"Đỏ trỗi dậy","Lê Đình Chi",20,102.000,"English"));
        books.add(new FictionBook(2,"Hai vạn dặm dưới đáy biện","Jules Verne",15,81.600,"Tiếng Việt"));
        books.add(new FictionBook(3,"Người minh họa","Ray Bradbury",10,100.000,"English"));
        books.add(new ProgramingBook(4,"Java căn bản","Pham Văn Trung",20,95.000,"Java"));
        books.add(new ProgramingBook(5,"Lập trình Java ","Trần Phú Tài",20,105.000,"Java"));
        books.add(new ProgramingBook(6,"Lập trình Python","Trần Văn Đạt",15,80.000,"Python"));
        books.add(new BusinessBook(7,"Tuyệt kỹ bán hàng","Xuân Chi Dịch",17,30.000,"Việt Nam"));
        books.add(new BusinessBook(8,"Nghĩ giàu và làm giàu","NaPoLeOn Hill",10,200.000,"USA"));
        books.add(new BusinessBook(9,"Đọc vị bất kì ai","Xuân Chi Dịch",12,90.000,"Việt Nam"));

    }
    @Override
    public void add(List value) {

    }

    @Override
    public void display(List value) {

    }

    @Override
    public void edit(List value, int index) {

    }

    @Override
    public void delete(List value, int index) {

    }

    @Override
    public void insert(List list, int index) {

    }

    @Override
    public void update(List list) {

    }

    @Override
    public void sort() {

    }

    @Override
    public void getRealMoney() {

    }
}

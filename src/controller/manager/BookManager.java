package controller.manager;

import model.Interface.CRUD;
import model.Interface.InSearchSort;
import model.Interface.RealMoney;
import model.book.Book;
import model.book.BusinessBook;
import model.book.FictionBook;
import model.book.ProgramingBook;
import read_write_file_singleton.ReadWriteFile;

import java.util.*;

public class BookManager implements CRUD<Book>, InSearchSort<Book>,RealMoney {
    public ReadWriteFile<Book> readWriteFile = ReadWriteFile.getINSTANCE();
    public List<Book> books;

    public BookManager(List<Book> books) {
        this.books = books;
    }
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
    public void add(List<Book> value) {
        books.add((Book) value);
    }

    @Override
    public void display(List<Book> value) {
        for (Book b:books
             ) {
            System.out.println(b);

        }
    }
    @Override
    public void edit(List<Book> value, int index) {
        for (int i = 0; i < value.size(); i++) {
            if(i == index) {
                books.set(i,(Book) value);
            }
        }
    }

    @Override
    public void delete(List<Book> value, int index) {
        for (int i = 0; i < value.size(); i++) {
            if(i == index) {
                books.remove(i);
                break;
            }
        }

    }
    @Override
    public void insert(List<Book> list, int index) {
        if(index >= 0) {
            books.set(index,(Book) list);
        } else {
            books.add((Book) list);
        }
    }
    @Override
    public void search(List<Book> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(name)){
                System.out.println(name + " index : " + i );
            } else {
                System.out.println("Can not found: ");
            }
        }
    }
    @Override
    public void sort() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
            private String getCategory(Book o){
                if( o instanceof FictionBook){
                    return ((FictionBook)o).getCategory();
                } else {
                    throw new IllegalArgumentException("Object type not supported.");
                }
            }
            private String getLanguage(Book o){
                if( o instanceof ProgramingBook){
                    return ((ProgramingBook)o).getLanguage();
                } else {
                    throw new IllegalArgumentException("Object type not supported.");
                }
            }
        });
    }
    public int totalLanguage(List<Book> list, String language,String name) {
        int total = 0;
        if (name.equals("FictionBook")) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) instanceof FictionBook) {
                    if (((FictionBook) list.get(i)).getCategory().equals(language)) {
                        total++;
                    }
                }
            }
            } else if (name.equals("ProgramingBook")) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) instanceof ProgramingBook) {
                    if (((ProgramingBook) list.get(i)).getLanguage().equals(language)) {
                        total++;
                    }
                }
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) instanceof BusinessBook) {
                    if (((BusinessBook) list.get(i)).getOrigin().equals(language)) {
                        total++;
                    }
                }
            }
        }
        return total;

    }
    @Override
    public void getRealMoney() {
        double total = 0;
        for (Book book: books
             ) {
            total += book.getPrice();
        }
        System.out.println("Total money book: " + total + " VND ");


    }
    public void readData(){
        readWriteFile.readFile("books.txt");

    }
    public void write(List<Book> value,String path) {
        readWriteFile.writeFile(books,path);
    }

//    private int getIndexByName(String title) {
//        int index = -1;
//        for (Book book: books
//             ) {
//            if(book.getTitle().equals(title)){
//                return books.indexOf(book);
//            }
//        }
//        return index;
//    }
}

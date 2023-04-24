package controller.manager;

import model.Interface.CRUD;
import model.person.Customer;
import model.person.Person;
import model.person.PersonManager;

import java.util.ArrayList;
import java.util.List;

public class UserBook implements CRUD<Person> {
    public List<Person> persons;

    public UserBook(List<Person> persons) {
        this.persons = persons;
    }

    public UserBook() {
        persons = new ArrayList<Person>();
        persons.add(new PersonManager("Trần Hồng Quân",24,"Hà Nội","Quản Lý"));
        persons.add(new Customer("Trần Xuân Mạnh",23,"Nam Định","083476698"));
    }

    @Override
    public void add(List<Person> value) {
        persons.add((Person) value);
    }

    @Override
    public void display(List<Person> value) {
        for (Person p:persons
             ) {
            System.out.println(p);
        }
    }

    @Override
    public void edit(List<Person> value, int index) {
        for (int i = 0; i < value.size(); i++) {
            if(i == index) {
                persons.set(i,(Person) value);
            }
        }
    }

    @Override
    public void delete(List<Person> value, int index) {
        for (int i = 0; i < value.size(); i++) {
            if(i == index){
                persons.remove(i);
                break;
            }
        }
    }
}

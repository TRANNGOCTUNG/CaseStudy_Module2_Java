package model.Interface;

import java.util.List;

public interface CRUD<T> {
   void add(List<T> value);
   void display(List<T> value);
   void edit(List<T> value,int index);
   void delete(List<T> value,int index);

}

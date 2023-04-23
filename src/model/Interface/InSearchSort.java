package model.Interface;

import java.util.List;

public interface InSearchSort<T> {
    void insert(List<T> list, int index );
    void search(List<T> list,String name);
    void sort();
}

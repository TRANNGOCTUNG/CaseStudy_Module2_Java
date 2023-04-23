package model.Interface;

import java.util.List;

public interface InUpSort<T> {
    void insert(List<T> list, int index );
    void update(List<T> list);
    void sort();
}

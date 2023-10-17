package ej1;

import java.util.List;

public interface SimpleList {

    int size();

    boolean isEmpty();

    boolean contains(Object element);

    void add(Object element);

    Object add(int index, Object element);

    Object set(int index, Object element);

    boolean remove(Object element);

    Object remove(int index);

    void addAll(List otherList);

    void clear();

    Object get(int index);

    int indexOf(Object element);
}

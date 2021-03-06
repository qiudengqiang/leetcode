package com.alphabethub.api.list;

public interface List<E> {
    int ELEMENT_NOT_FOUND = -1;

    int size();

    void clear();

    boolean isEmpty();

    void add(E element);

    void add(int index, E element);

    E get(int index);

    E set(int index, E element);

    E remove(int index);

    boolean contains(E element);

    int indexOf(E element);

}

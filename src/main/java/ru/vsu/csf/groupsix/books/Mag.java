package ru.vsu.csf.groupsix.books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Mag extends LibItem {

    private final List<String> authors = new ArrayList<>();

    public List<String> getAuthors() {
        return Collections.unmodifiableList(authors);
    }

    public boolean isEmpty() {
        return authors.isEmpty();
    }

    public boolean contains(Object o) {
        return authors.contains(o);
    }

    public boolean add(String s) {
        return authors.add(s);
    }

    public boolean remove(Object o) {
        return authors.remove(o);
    }

    public void clear() {
        authors.clear();
    }

    public ListIterator<String> listIterator(int index) {
        return authors.listIterator(index);
    }
}

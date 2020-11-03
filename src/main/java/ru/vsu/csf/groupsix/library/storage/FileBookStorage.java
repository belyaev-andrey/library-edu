package ru.vsu.csf.groupsix.library.storage;

import ru.vsu.csf.groupsix.books.LibItem;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class FileBookStorage implements BookStorage {

    @Override
    public List<LibItem> findItem(LibItem request) {
        return Collections.emptyList();//TODO implement search
    }

    @Override
    public LibItem giveItem(LibItem request) {
        return null;
    }

    @Override
    public LibItem returnItem(LibItem request) {
        return null;
    }

    @Override
    public LibItem storeItem(LibItem item) {
        return null;
    }
}

package ru.vsu.csf.groupsix.library.storage;

import ru.vsu.csf.groupsix.books.LibItem;

import java.util.List;

public interface BookStorage {
    List<LibItem> findItem(LibItem request);

    LibItem giveItem(LibItem request);

    LibItem returnItem(LibItem request);

    LibItem storeItem(LibItem item);
}

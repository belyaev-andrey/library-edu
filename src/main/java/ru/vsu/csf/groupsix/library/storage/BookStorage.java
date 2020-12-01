package ru.vsu.csf.groupsix.library.storage;

import ru.vsu.csf.groupsix.books.LibItem;
import ru.vsu.csf.groupsix.common.exception.BookStorageException;
import ru.vsu.csf.groupsix.common.exception.BookStorageSearchException;

import java.util.List;

public interface BookStorage {

    /**
     *
     * @param request
     * @return
     * @throws BookStorageException if search goes wrong
     */
    List<LibItem> findItem(LibItem request) throws BookStorageSearchException;

    LibItem giveItem(LibItem request);

    LibItem returnItem(LibItem request);

    LibItem storeItem(LibItem item) throws BookStorageException;
}

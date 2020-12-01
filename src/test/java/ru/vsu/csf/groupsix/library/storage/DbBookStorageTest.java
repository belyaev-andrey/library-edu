package ru.vsu.csf.groupsix.library.storage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.csf.groupsix.books.Book;
import ru.vsu.csf.groupsix.books.LibItem;
import ru.vsu.csf.groupsix.common.exception.BookStorageException;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DbBookStorageTest {

    @Test
    public void testAddBook() throws BookStorageException {

        Book b = new Book();
        final long id = new Date().getTime();
        b.setId(id);
        b.setName("War and Peace "+id);
        b.setPageNum(1000);
        b.setAuthor("Tolstoy");

        BookStorage dbBookStorage = new DbBookStorage();
        LibItem itm = dbBookStorage.storeItem(b);
        assertEquals(id, itm.getId().longValue());
    }

    @Test
    public void testSearchBook() throws BookStorageException {

        Book b = new Book();
        final long id = new Date().getTime();
        b.setId(id);
        b.setName("Search "+id);
        b.setPageNum(1);
        b.setAuthor("");

        BookStorage dbBookStorage = new DbBookStorage();
        dbBookStorage.storeItem(b);

        LibItem itm = new LibItem();
        itm.setName("Search");

        List<LibItem> items = dbBookStorage.findItem(itm);
        assertFalse(items.isEmpty());
        assertTrue(items.get(0).getName().startsWith("Search"));
    }

}

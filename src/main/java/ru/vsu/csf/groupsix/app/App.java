package ru.vsu.csf.groupsix.app;

import ru.vsu.csf.groupsix.app.ui.AppGuiScreen;
import ru.vsu.csf.groupsix.books.LibItem;
import ru.vsu.csf.groupsix.common.exception.BookStorageException;
import ru.vsu.csf.groupsix.library.ElectronicLibrary;
import ru.vsu.csf.groupsix.library.Library;
import ru.vsu.csf.groupsix.library.LibraryCard;
import ru.vsu.csf.groupsix.library.storage.BookStorage;
import ru.vsu.csf.groupsix.library.storage.DbBookStorage;

public class App {

    public static void main(String[] args) {

/*
        BookStorage storage = getBookStorage();
        Library library = new ElectronicLibrary(storage);
        final LibraryCard card = library.registerUser("user1");
        try {
            storage.findItem(new LibItem()).forEach(card::giveBook);
        } catch (BookStorageException ex) {
            System.out.println("Search failed: "+ex.getMessage());
        }

*/
        AppGuiScreen screen = new AppGuiScreen();
        screen.launchApp();

    }

    private static BookStorage getBookStorage() {
        return new DbBookStorage();
    }

}

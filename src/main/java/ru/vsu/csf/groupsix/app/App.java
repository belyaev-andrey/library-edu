package ru.vsu.csf.groupsix.app;

import ru.vsu.csf.groupsix.library.ElectronicLibrary;
import ru.vsu.csf.groupsix.library.Library;
import ru.vsu.csf.groupsix.library.storage.BookStorage;
import ru.vsu.csf.groupsix.library.storage.DbBookStorage;
import ru.vsu.csf.groupsix.library.storage.FileBookStorage;

public class App {

    public static void main(String[] args) {

        BookStorage storage = getBookStorage();
        Library library = new ElectronicLibrary(storage);
        library.registerUser("user1");
    }

    private static BookStorage getBookStorage() {
        return new DbBookStorage();
    }

}

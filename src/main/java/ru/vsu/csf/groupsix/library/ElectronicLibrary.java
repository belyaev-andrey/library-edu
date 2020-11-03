package ru.vsu.csf.groupsix.library;

import ru.vsu.csf.groupsix.library.storage.BookStorage;

public class ElectronicLibrary extends Library {

    public ElectronicLibrary(BookStorage bookStorage) {
        super(bookStorage);
    }

    @Override
    public LibraryCard registerUser(String login) {
        return super.registerUser(login);//TODO выдать электронную карту
    }
}

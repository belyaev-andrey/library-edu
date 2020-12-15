package ru.vsu.csf.groupsix.library;

import ru.vsu.csf.groupsix.library.storage.book.BookStorage;
import ru.vsu.csf.groupsix.library.storage.user.UserStorage;

public class ElectronicLibrary extends Library {

    public ElectronicLibrary(BookStorage bookStorage, UserStorage userStorage) {
        super(bookStorage, userStorage);
    }

    @Override
    public LibraryCard registerUser(String login) {
        return super.registerUser(login);//TODO выдать электронную карту
    }
}

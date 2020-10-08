package ru.vsu.csf.groupsix.library;

import ru.vsu.csf.groupsix.books.LibItem;
import ru.vsu.csf.groupsix.users.User;

import java.time.LocalDateTime;

public class Library {

    private BookStorage bookStorage;

    public LibraryCard registerUser(String login) {
        return null;
    }

    public LibraryCard giveBook(User user, LibItem request) {
        bookStorage.findItem(request).forEach(item -> {
            bookStorage.giveItem(item);
            user.getCard().giveBook(item);
        });
        return null;
    }

    public LocalDateTime returnBook(LibItem returnBook) {
        return null;
    }

}

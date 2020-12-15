package ru.vsu.csf.groupsix.library;

import ru.vsu.csf.groupsix.books.LibItem;
import ru.vsu.csf.groupsix.library.command.BookCommand;
import ru.vsu.csf.groupsix.library.storage.GiveBookStrategy;
import ru.vsu.csf.groupsix.library.storage.PayForRentStrategy;
import ru.vsu.csf.groupsix.library.storage.book.BookStorage;
import ru.vsu.csf.groupsix.library.storage.user.UserStorage;
import ru.vsu.csf.groupsix.users.User;
import ru.vsu.csf.groupsix.users.UserBuilder;

import java.time.LocalDateTime;
import java.util.Random;

public class Library {

    private BookStorage bookStorage;

    private UserStorage userStorage;

    private Random random = new Random();

    public Library(BookStorage bookStorage, UserStorage userStorage) {
        this.bookStorage = bookStorage;
        this.userStorage = userStorage;
    }

    public LibraryCard registerUser(String login) {
        User user = UserBuilder.create()
                .withId(random.nextLong())
                .withLogin(login).build();
        LibraryCard card = new LibraryCard(user);
        return userStorage.saveCard(card);
    }

    public LibraryCard giveBook(BookCommand command) {
        return command.execute();
    }

    public LocalDateTime returnBook(LibItem returnBook) {
        return null;
    }

}

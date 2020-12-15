package ru.vsu.csf.groupsix.library.command;

import ru.vsu.csf.groupsix.books.LibItem;
import ru.vsu.csf.groupsix.common.exception.BookStorageSearchException;
import ru.vsu.csf.groupsix.library.LibraryCard;
import ru.vsu.csf.groupsix.library.storage.GiveBookStrategy;
import ru.vsu.csf.groupsix.library.storage.PayForRentStrategy;
import ru.vsu.csf.groupsix.library.storage.book.BookStorage;
import ru.vsu.csf.groupsix.users.User;

public class GiveBookCommand implements BookCommand {

    private BookStorage bookStorage;

    private User user;

    private LibItem request;

    @Override
    public BookCommand withStorage(BookStorage storage) {
        this.bookStorage = storage;
        return this;
    }

    @Override
    public BookCommand withRequest(LibItem request) {
        this.request = request;
        return this;
    }

    @Override
    public BookCommand withUser(User user) {
        this.user = user;
        return this;
    }

    @Override
    public LibraryCard execute() {
        try {
            bookStorage.findItem(request).forEach(item -> {
                bookStorage.giveItem(item);
                user.getCard().giveBook(item);
            });
        } catch (BookStorageSearchException e) {
            e.printStackTrace();
        }
        return user.getCard();
    }
}

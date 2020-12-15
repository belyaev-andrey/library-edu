package ru.vsu.csf.groupsix.library.command;

import ru.vsu.csf.groupsix.books.LibItem;
import ru.vsu.csf.groupsix.library.LibraryCard;
import ru.vsu.csf.groupsix.library.storage.book.BookStorage;
import ru.vsu.csf.groupsix.users.User;

public interface BookCommand {

    BookCommand withStorage(BookStorage storage);

    BookCommand withUser(User user);

    BookCommand withRequest(LibItem request);

    LibraryCard execute();

}

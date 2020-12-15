package ru.vsu.csf.groupsix.library.storage.factory;

import ru.vsu.csf.groupsix.library.storage.book.BookStorage;
import ru.vsu.csf.groupsix.library.storage.user.UserStorage;

public interface StorageFactory {

    BookStorage getBookStorage();

    UserStorage getUserStorage();

}

package ru.vsu.csf.groupsix.library.storage.factory;

import ru.vsu.csf.groupsix.library.storage.book.BookStorage;
import ru.vsu.csf.groupsix.library.storage.book.DbBookStorage;
import ru.vsu.csf.groupsix.library.storage.user.DbUserStorage;
import ru.vsu.csf.groupsix.library.storage.user.UserStorage;

public class DbStorageFactory implements StorageFactory {

    @Override
    public BookStorage getBookStorage() {
        return new DbBookStorage(new ConnectionProxy());
    }

    @Override
    public UserStorage getUserStorage() {
        return new DbUserStorage();
    }
}

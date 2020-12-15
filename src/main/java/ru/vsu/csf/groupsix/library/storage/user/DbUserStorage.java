package ru.vsu.csf.groupsix.library.storage.user;

import ru.vsu.csf.groupsix.library.LibraryCard;

public class DbUserStorage implements UserStorage {

    @Override
    public LibraryCard saveCard(LibraryCard card) {
        return card;
    }
}

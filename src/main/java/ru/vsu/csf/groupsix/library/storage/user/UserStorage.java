package ru.vsu.csf.groupsix.library.storage.user;

import ru.vsu.csf.groupsix.library.LibraryCard;

public interface UserStorage {

    LibraryCard saveCard(LibraryCard card);
}

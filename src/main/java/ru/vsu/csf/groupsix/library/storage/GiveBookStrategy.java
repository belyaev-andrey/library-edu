package ru.vsu.csf.groupsix.library.storage;

import ru.vsu.csf.groupsix.books.LibItem;

public interface GiveBookStrategy {

    LibItem giveItem(LibItem request);

}

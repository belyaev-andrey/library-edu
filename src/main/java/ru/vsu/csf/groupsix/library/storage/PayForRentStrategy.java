package ru.vsu.csf.groupsix.library.storage;

import ru.vsu.csf.groupsix.books.LibItem;

public class PayForRentStrategy implements GiveBookStrategy {

    @Override
    public LibItem giveItem(LibItem request) {
        return request;
    }
}

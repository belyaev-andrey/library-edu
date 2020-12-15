package ru.vsu.csf.groupsix.library;

import ru.vsu.csf.groupsix.books.LibItem;
import ru.vsu.csf.groupsix.common.Storeable;
import ru.vsu.csf.groupsix.users.User;

import java.time.LocalDateTime;
import java.util.List;

public class LibraryCard implements Storeable {

    private Long id;

    private final User user;

    private List<CardItem> items;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public LibraryCard(User user) {
        this.user = user;
        user.setCard(this);
    }

    public LocalDateTime giveBook(LibItem libItem) {
        LocalDateTime dateGiven = LocalDateTime.now();
        CardItem itm = new CardItem(libItem, dateGiven);
        items.add(itm);
        return dateGiven;
    }

    public LocalDateTime returnBook(LibItem libItem) {
        LocalDateTime dateReturn = LocalDateTime.now();

        items.stream()
                .filter(itm -> itm.getLibItem().getId().equals(libItem.getId()))
                .forEach(libItm -> libItm.setDateReturn(dateReturn));

        return dateReturn;
    }

}

package ru.vsu.csf.groupsix.library;

import ru.vsu.csf.groupsix.books.LibItem;
import ru.vsu.csf.groupsix.common.Storeable;

import java.time.LocalDateTime;

public class CardItem implements Storeable {

    private Long id;

    private LibItem libItem;

    private LocalDateTime dateGiven;

    private LocalDateTime dateReturn;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public CardItem(LibItem libItem, LocalDateTime dateGiven) {
        this.libItem = libItem;
        this.dateGiven = dateGiven;
    }

    public LibItem getLibItem() {
        return libItem;
    }

    public void setLibItem(LibItem libItem) {
        this.libItem = libItem;
    }

    public LocalDateTime getDateGiven() {
        return dateGiven;
    }

    public void setDateGiven(LocalDateTime dateGiven) {
        this.dateGiven = dateGiven;
    }

    public LocalDateTime getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(LocalDateTime dateReturn) {
        this.dateReturn = dateReturn;
    }
}

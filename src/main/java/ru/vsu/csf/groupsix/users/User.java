package ru.vsu.csf.groupsix.users;

import ru.vsu.csf.groupsix.books.LibItem;
import ru.vsu.csf.groupsix.common.Storeable;
import ru.vsu.csf.groupsix.library.LibraryCard;

public class User implements Storeable {

    private Long id;

    private String login;

    private LibraryCard card;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public LibraryCard getCard() {
        return card;
    }

    public void setCard(LibraryCard card) {
        this.card = card;
    }
}

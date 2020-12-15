package ru.vsu.csf.groupsix.users;

import ru.vsu.csf.groupsix.library.LibraryCard;

public class UserBuilder {

    private final User user = new User();

    private UserBuilder() {

    }

    public static UserBuilder create() {
        return new UserBuilder();
    }

    public UserBuilder withId(Long id) {
        user.setId(id);
        return this;
    }

    public UserBuilder withLogin(String login) {
        user.setLogin(login);
        return this;
    }

    public UserBuilder withLibraryCard(LibraryCard card) {
        user.setCard(card);
        return this;
    }

    public User build() {
        return user;
    }

}

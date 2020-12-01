package ru.vsu.csf.groupsix.library.storage;

import ru.vsu.csf.groupsix.books.Book;
import ru.vsu.csf.groupsix.books.LibItem;
import ru.vsu.csf.groupsix.common.exception.BookStorageException;
import ru.vsu.csf.groupsix.common.exception.BookStorageSearchException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbBookStorage implements BookStorage {

    @Override
    public List<LibItem> findItem(LibItem request) throws BookStorageSearchException {
        List<LibItem> result = new ArrayList<>();
        try (Connection c = getConnection()) {
            //select id, name, pages, author from books where name like request.getName()+"%"
            PreparedStatement statement = c.prepareStatement("select id, name, pages, author from books where name like ?");
            statement.setString(1, request.getName()+"%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setId(rs.getLong(1));
                b.setName(rs.getString(2));
                b.setPageNum(rs.getInt(3));
                b.setAuthor(rs.getString(4));
                result.add(b);
            }
        } catch (SQLException exception) {
            throw new BookStorageSearchException("Cannot find library item", exception);
        }
        return result;
    }

    @Override
    public LibItem giveItem(LibItem request) {
        return null;
    }

    @Override
    public LibItem returnItem(LibItem request) {
        return null;
    }

    @Override
    public LibItem storeItem(LibItem item) throws BookStorageException {
        try (Connection c = getConnection()) {
            //insert into books (id, name, pages, author) values (item.getId(), itm.getName(),....)
            //Statement statement = c.createStatement();
            //statement.execute("insert into books (id, name, pages, author) values (1, 'War and Peace'); drop table books;--, 1000, 'Tolstoy')");
            PreparedStatement stmt = c.prepareStatement("insert into books (id, name, pages, author) values (?, ?, ?, ?)");
            stmt.setLong(1, item.getId());
            stmt.setString(2, item.getName());
            stmt.setInt(3, item.getPageNum());
            if (item instanceof Book) {
                stmt.setString(4, ((Book)item).getAuthor());
            }
            stmt.executeUpdate();
            return item;
        } catch (SQLException exception) {
            throw new BookStorageException(exception);
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:tcp://localhost:1521/librarydb", "sa", "");
    }

}

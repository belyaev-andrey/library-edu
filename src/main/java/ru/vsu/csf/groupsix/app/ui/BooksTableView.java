package ru.vsu.csf.groupsix.app.ui;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ru.vsu.csf.groupsix.books.Book;
import ru.vsu.csf.groupsix.library.storage.book.BookStorage;

public class BooksTableView extends TableView<Book> {

    private BookStorage storage;

    public BooksTableView(BookStorage storage) {
        this.storage = storage;
        TableColumn<Book, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(400);
        getColumns().add(nameColumn);
    }

}

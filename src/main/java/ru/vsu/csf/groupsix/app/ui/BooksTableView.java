package ru.vsu.csf.groupsix.app.ui;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ru.vsu.csf.groupsix.books.Book;

public class BooksTableView extends TableView<Book> {

    public BooksTableView() {

        TableColumn<Book, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(400);
        getColumns().add(nameColumn);

    }

}

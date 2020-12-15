package ru.vsu.csf.groupsix.app.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.vsu.csf.groupsix.app.StorageConfig;
import ru.vsu.csf.groupsix.library.storage.factory.DbStorageFactory;
import ru.vsu.csf.groupsix.library.storage.factory.StorageFactory;

public class AppGuiScreen extends Application {

    private StorageFactory storageFactory;

    public AppGuiScreen(StorageConfig config) {
        switch (config) {
            case DB: {
                storageFactory = new DbStorageFactory();
                break;
            }
            case FILE:
                storageFactory = null;
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new BooksTableView(storageFactory.getBookStorage()), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public void launchApp() {
        launch();
    }

}

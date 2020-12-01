package ru.vsu.csf.groupsix.app.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppGuiScreen extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new BooksTableView(), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public void launchApp() {
        launch();
    }

}

package ru.vsu.csf.groupsix.app;

import ru.vsu.csf.groupsix.app.ui.AppGuiScreen;

public class App {

    public static void main(String[] args) {

        AppGuiScreen screen = new AppGuiScreen(StorageConfig.DB);
        screen.launchApp();

    }

}

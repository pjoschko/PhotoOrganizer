package main.java;

import java.io.File;

public class ApplicationLoader {

    public static void main(String[] args) {
        var application = new Application();
        application.getItemsFromDirectory(new File("\\\\HAPPY-CLOUD\\photos"));
    }
}

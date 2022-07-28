package main.java;

import java.io.File;



public class ApplicationLoader {

//    static final String rootDir="^\\\\HAPPY-CLOUD\\photos";
    static final String rootDir="/^mnt/happy-cloud-photos";

    public static void main(String[] args) {
        var application = new Application();
        application.getItemsFromDirectory(new File(rootDir));
    }
}

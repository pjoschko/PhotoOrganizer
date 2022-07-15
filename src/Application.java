import java.io.File;
import java.util.stream.Stream;

public class Application {

    private int numberOfFiles=0;
    private int numberOfDirectories=0;

    public void getItemsFromDirectory(File path) {
        if(path == null) {
            throw new IllegalArgumentException("Item is null.");
        }
        if(!path.isDirectory()) {
            throw new IllegalArgumentException(path.toString()+" is not a directory.");
        }

        System.out.println("Getting items from:"+path);

        var itemList = path.listFiles();

        Stream.of(itemList)
                .filter(item -> !item.isDirectory())
                .forEach(file -> {
                    System.out.println(file);
                    this.numberOfFiles++;
                });

        Stream.of(itemList)
                .filter(item -> item.isDirectory())
                .forEach(subdirectory -> {
                    this.getItemsFromDirectory(subdirectory);
                    this.numberOfDirectories++;
                });

        System.out.println("Number of files: " + numberOfFiles);
        System.out.println("Number of path: " + numberOfDirectories);
    }

}

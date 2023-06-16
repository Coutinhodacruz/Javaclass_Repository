package file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class FileSample {
    public static void main(String[] args) throws IOException {
//        Path path = Path.of("src", "file","second-file.txt");
//
//        Files.createFile(path);
        Path path = Paths.get("C:\\Users\\Admin\\idealProject\\javaclass");
        DirectoryStream<Path> contents = Files.newDirectoryStream(path);
//        Files.createDirectory(path);


        Iterator<Path> iterator = contents.iterator();
        while (iterator.hasNext()){
            Path content = iterator.next();
            System.out.println(content.getFileName());
        }
    }
}

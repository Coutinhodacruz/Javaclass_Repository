package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Admin\\IdeaProjects\\Javaclass\\src\\file\\elites.txt");
        try {

            System.out.println(Files.getLastModifiedTime(path));


        }catch (IOException exception){
            System.err.print("ERROR::" + exception);
        }

    }
}

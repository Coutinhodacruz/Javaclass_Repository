package file.iostreams.outputstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {

        try(
                FileWriter fileWriter = new FileWriter("sample.txt");
                BufferedWriter writer = new BufferedWriter(fileWriter)
                ){
            writer.write("""
                    If you want change the world
                    Start from the top and say i can
                    """);

        }catch (IOException exception){
            System.err.println("ERROR:: "+ exception);
        }

    }
}

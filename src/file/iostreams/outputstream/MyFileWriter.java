package file.iostreams.outputstream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MyFileWriter {
    public static void main(String[] args) {

        try(FileWriter fileWriter = new FileWriter("filewriter.txt")){

            fileWriter.write(Arrays.toString("""
                    There is a tide in the affairs
                             """.getBytes()));



        }catch (IOException exception){
            System.err.println("ERROR:: " + exception);
        }


    }
}

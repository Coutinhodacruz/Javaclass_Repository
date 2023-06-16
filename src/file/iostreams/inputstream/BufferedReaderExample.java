package file.iostreams.inputstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {

        try (

                FileReader fileReader = new FileReader("filewriter.txt");
                BufferedReader reader = new BufferedReader(fileReader)
        ){

            char[] text = new char[1024];
            reader.read(text);
            for (char ch : text){
                System.out.println(ch);
            }

        }catch (IOException exception){
            System.err.println("ERROR:: " + exception);
        }


    }
}

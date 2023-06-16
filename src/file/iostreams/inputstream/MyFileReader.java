package file.iostreams.inputstream;

import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static void main(String[] args) {

        try(FileReader fileReader = new FileReader("test.txt")){

            char[] text = new char[1024];
             fileReader.read(text);

             for (char ch : text) printCharacter(ch);




        }catch (IOException exception){
            System.err.println("ERROR:: " +exception);
        }
    }

    private static void printCharacter(char ch) {
        System.out.print(ch);
    }
}

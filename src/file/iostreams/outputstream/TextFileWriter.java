package file.iostreams.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class TextFileWriter {

    public static void main(String[] args) {
        FileOutputStream errorStream;

        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt", true)){
            fileOutputStream.write("""
                   
                   Cephas with the sleepy eyes
                   Maleek with the money
                   Favour black ANU !!!!
                   Coutinho Star boy
                   Legend for the ladies
                   Sheriff for the chatGPt
                   
                   \n""".getBytes());

        }catch (IOException exception){
//            System.setErr(new PrintStream());
            System.err.print("ERROR !!!");
        }
    }

}

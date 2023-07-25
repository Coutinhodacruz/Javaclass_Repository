package file.iostreams.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public static void main(String[] args) {

        Person person = new Person("Coutinho", 10);

        try(var fileOutputStream = new FileOutputStream("person");
                var objectOutputStream =
                        new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(person);
            System.out.println("Object written to file");


        }catch (IOException exception){
            System.err.println("ERROR !!!" + exception);

        }
    }
}

package file.iostreams.inputstream;

import file.iostreams.outputstream.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

    public static void main(String[] args) {

        try (var fileInputStream  = new FileInputStream("person");
             var objectStream =
                     new ObjectInputStream(fileInputStream)){

            Object readObject = objectStream.readObject();
            Person person = (Person) readObject;
            System.out.println(person);
        }catch (IOException | ClassNotFoundException exception){
            System.err.println("ERROR:: !!" + exception);
        }
    }
}

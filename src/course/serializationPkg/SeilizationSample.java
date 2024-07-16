package course.serializationPkg;

import java.io.*;

public class SeilizationSample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("polo", "gt", "123"); // vehicle we have to serialize
        try {
            FileOutputStream fileout = new FileOutputStream("polo.ser");
            // FileOutputStream is used to serialize an object and we will pass file name in
            // with byte stream
            // will be saved so standard is file extension .ser
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            // ObjectInputStream is used create object for stream by passing in
            // FileOutputStream
            out.writeObject(vehicle); // vehicle we have to serialize
            out.close(); // colse this stream
            fileout.close();
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        System.out.println("File serialization done");
    }
}

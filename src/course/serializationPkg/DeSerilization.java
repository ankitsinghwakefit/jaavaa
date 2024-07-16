package course.serializationPkg;

import java.io.*;

public class DeSerilization {
    public static void main(String[] args) {
        Vehicle vehicle = null;
        try {
            FileInputStream in = new FileInputStream("polo.ser");
            ObjectInputStream ois = new ObjectInputStream(in);
            vehicle = (Vehicle) ois.readObject();
            ois.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(vehicle.brand);
    }
}

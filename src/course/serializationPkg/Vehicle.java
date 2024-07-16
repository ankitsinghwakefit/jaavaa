package course.serializationPkg;

import java.io.Serializable;

public class Vehicle implements Serializable {
    String brand;
    String name;
    String model;

    Vehicle(String brand, String name, String model) {
        this.brand = brand;
        this.name = name;
        this.model = model;
    }
}

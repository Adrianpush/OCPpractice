package design_patterns;

public class FactoryPattern {
}

abstract class Vehicle {

}

class Car extends Vehicle {

}

class Van extends Vehicle {

}

class Truck extends Vehicle {

}

class VehicleFactory {

    public static Vehicle createVehicle(String type) {
        switch (type) {
            case "truck": return new Truck();
            case "car": return new Car();
            case "van": return new Van();
            default: throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}


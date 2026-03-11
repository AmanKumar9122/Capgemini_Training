import java.util.*;

abstract class Vehicle {
    String name;
    double fuel;

    Vehicle(String name, double fuel) {
        this.name = name;
        this.fuel = fuel;
    }

    abstract double calculateMileage(double distance);

    void display() {
        System.out.println(name + " " + fuel);
    }
}

class Car extends Vehicle {

    Car(String name, double fuel) {
        super(name, fuel);
    }

    double calculateMileage(double distance) {
        return distance / fuel;
    }
}

class Bike extends Vehicle {

    Bike(String name, double fuel) {
        super(name, fuel);
    }

    double calculateMileage(double distance) {
        return distance / fuel;
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle v1 = new Car("Sedan", 10);
        Vehicle v2 = new Bike("SportsBike", 5);

        v1.display();
        v2.display();

        System.out.println(v1.calculateMileage(150));
        System.out.println(v2.calculateMileage(150));
    }
}
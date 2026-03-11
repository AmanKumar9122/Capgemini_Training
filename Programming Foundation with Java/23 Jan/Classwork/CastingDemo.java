import java.util.*;

class Vehicle {
    void start() {
        System.out.println("Vehicle starting");
    }

    void stop() {
        System.out.println("Vehicle stopping");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starting with key");
    }

    void openTrunk() {
        System.out.println("Trunk opened");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starting with kick");
    }

    void wheelie() {
        System.out.println("Bike doing wheelie");
    }
}

public class CastingDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();

        Car c = (Car) v1;
        c.openTrunk();

        Bike b = (Bike) v2;
        b.wheelie();
    }
}
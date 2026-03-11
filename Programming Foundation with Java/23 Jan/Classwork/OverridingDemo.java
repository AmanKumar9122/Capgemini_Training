import java.util.*;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal sound");
    }

    void move() {
        System.out.println("Animal moves");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println("Dog barks");
    }

    void move() {
        System.out.println("Dog runs");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void sound() {
        System.out.println("Cat meows");
    }

    void move() {
        System.out.println("Cat jumps");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog("Tommy");
        Animal a2 = new Cat("Kitty");

        a1.sound();
        a1.move();

        a2.sound();
        a2.move();

        Animal a3 = new Animal("Generic");
        a3.sound();
        a3.move();
    }
}
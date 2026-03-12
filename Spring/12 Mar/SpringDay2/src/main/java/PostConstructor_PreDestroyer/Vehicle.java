package PostConstructor_PreDestroyer;

public class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle Constructor");
    }
    public void moving() {
        System.out.println("Vehicle is moving");
    }
    public void accident() {
        System.out.println("Thank god, No lives lost");
    }
}

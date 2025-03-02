// Defining an interface
interface Vehicle {
    void start();  // Abstract method (no body)
    void stop();
}

// Implementing the interface in a class
class Car implements Vehicle {
    // Providing implementation for interface methods
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        Car myCar = new Car();  // Creating an object of Car
        myCar.start();  // Calling implemented method
        myCar.stop();
    }
}

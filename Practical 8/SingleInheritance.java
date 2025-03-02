// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class SingleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Calling parent class method
        myDog.bark(); // Calling child class method
    }
}

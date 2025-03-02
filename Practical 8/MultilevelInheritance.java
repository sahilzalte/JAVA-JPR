// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate child class (inherits from Animal)
class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammals breathe oxygen.");
    }
}

// Derived class (inherits from Mammal)
class Human extends Mammal {
    void speak() {
        System.out.println("Humans can speak.");
    }
}

// Main class
public class MultilevelInheritance {
    public static void main(String[] args) {
        Human person = new Human();
        person.eat();   // Calling grandparent class method
        person.breathe(); // Calling parent class method
        person.speak();  // Calling child class method
    }
}

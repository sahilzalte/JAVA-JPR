// Parent class
class Animal {
    void sound() {
        System.out.println("Animals Class.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog Class.");
    }
}

// Main class
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Inherited method from Animal class
        d.bark();  // Method from Dog class
    }
}

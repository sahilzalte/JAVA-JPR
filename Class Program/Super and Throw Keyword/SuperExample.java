class Parent {
    void show() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    void display() {
        super.show(); // Calls the Parent class method explicitly
        System.out.println("This is the Child class.");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}

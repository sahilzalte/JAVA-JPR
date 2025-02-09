package Interfaces;
// Define the interface

interface Hello {
    void a(); // Abstract method
    void b();
    void c();
}
// Implement the interface in the C1 class
public class Interface_in_java implements Hello {
    
    // Constructor
    Interface_in_java() {
        super();
    }

    // Implementing all methods from the interface
    public void a() {
        System.out.println("From subclass: a()");
    }

    public void b() {
        System.out.println("From subclass: b()");
    }

    public void c() {
        System.out.println("From subclass: c()");
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        Interface_in_java obj = new Interface_in_java();
        obj.a();
        obj.b();
        obj.c();
    }
}

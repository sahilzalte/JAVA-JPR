class Student {
    String name;
    int age;

    // 1. Default Constructor (No arguments)
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor Called");
    }

    // 2. Parameterized Constructor (Takes arguments)
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor Called");
    }

    // 3. Copy Constructor (Copies values from another object)
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        System.out.println("Copy Constructor Called");
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Using Default Constructor
        Student s1 = new Student();
        s1.display();

        // Using Parameterized Constructor
        Student s2 = new Student("Sahil", 20);
        s2.display();

        // Using Copy Constructor
        Student s3 = new Student(s2);
        s3.display();
    }
}

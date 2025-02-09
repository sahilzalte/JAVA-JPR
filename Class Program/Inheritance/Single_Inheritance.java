package Inheritance;
class base {
    int x;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void print() {
        System.out.println("I am Constructor");
    }

}

class derived extends base {
    int y;

    public int gety(int y) {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }

}

public class Single_Inheritance {
    public static void main(String[] args) {
        // Creating object of Base Class
        base b = new base();
        b.setx(15);
        System.out.println(b.getx());

        // Creating object of Derived Class
        derived d = new derived();
        d.setx(5);
        System.out.println(d.getx());

    }
}

public class PrimitiveToObject {
    public static void main(String[] args) {
        // Primitive data types
        int num = 100;
        double d = 10.5;
        char c = 'A';

        // Manual Boxing (Using Wrapper class constructors)
        Integer intObj = Integer.valueOf(num);
        Double doubleObj = Double.valueOf(d);
        Character charObj = Character.valueOf(c);

        // Autoboxing (Automatic conversion)
        Integer autoIntObj = num;
        Double autoDoubleObj = d;
        Character autoCharObj = c;

        // Displaying values
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);

        System.out.println("Autoboxed Integer: " + autoIntObj);
        System.out.println("Autoboxed Double: " + autoDoubleObj);
        System.out.println("Autoboxed Character: " + autoCharObj);
    }
}

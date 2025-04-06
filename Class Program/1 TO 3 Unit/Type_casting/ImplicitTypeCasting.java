package Type_casting;
public class ImplicitTypeCasting {

    public static void main(String[] args) {
        int a = 10;     // Size = 4 bytes
        double b = a;   // Size = 8 bytes (Implicit Type Casting)
        System.out.println(b);
    }
}

// Implicit type casting is performed automatically by the compiler.
// It converts a smaller data type into a larger data type.

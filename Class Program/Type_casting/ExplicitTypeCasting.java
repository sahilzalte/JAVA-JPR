package Type_casting;
public class ExplicitTypeCasting {

    public static void main(String[] args) {
        double x = 10.4373; // Size = 8 bytes
        int y = (int) x; // Size = 4 bytes (Explicit Type Casting)
        System.out.println(y);
    }
}

// Explicit type casting is performed manually using type conversion.
// It converts a larger data type into a smaller data type.

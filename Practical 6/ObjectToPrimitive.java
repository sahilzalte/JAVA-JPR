public class ObjectToPrimitive {
    public static void main(String[] args) {
        // Creating Wrapper Objects
        Integer intObj = Integer.valueOf(200);
        Double doubleObj = Double.valueOf(20.5);
        Character charObj = Character.valueOf('B');

        // Manual Unboxing (Using Wrapper class methods)
        int num = intObj.intValue();
        double d = doubleObj.doubleValue();
        char c = charObj.charValue();

        // Auto-unboxing (Automatic conversion)
        int autoNum = intObj;
        double autoDouble = doubleObj;
        char autoChar = charObj;

        // Displaying values
        System.out.println("Primitive int: " + num);
        System.out.println("Primitive double: " + d);
        System.out.println("Primitive char: " + c);

        System.out.println("Auto-unboxed int: " + autoNum);
        System.out.println("Auto-unboxed double: " + autoDouble);
        System.out.println("Auto-unboxed char: " + autoChar);
    }
}

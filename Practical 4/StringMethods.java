public class StringMethods {
    public static void main(String[] args) {
        // Creating a string
        String str = "Hello, World!";

        // 1. length() - Returns the length of the string
        System.out.println("Length: " + str.length());

        // 2. charAt(index) - Returns character at specified index
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. substring(start, end) - Extracts a substring
        System.out.println("Substring (0 to 5): " + str.substring(0, 5));

        // 4. toUpperCase() - Converts to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 5. toLowerCase() - Converts to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 6. replace() - Replaces characters
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // 7. contains() - Checks if string contains a sequence
        System.out.println("Contains 'Hello': " + str.contains("Hello"));

        // 8. startsWith() & endsWith()
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with '!': " + str.endsWith("!"));

        // 9. trim() - Removes leading and trailing spaces
        String str2 = "  Java Programming  ";
        System.out.println("Trimmed: '" + str2.trim() + "'");

        // 10. split() - Splitting string
        String[] words = str.split(", ");
        System.out.println("Split words: " + words[0] + " & " + words[1]);
    }
}

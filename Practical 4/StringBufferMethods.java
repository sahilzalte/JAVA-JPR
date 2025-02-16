public class StringBufferMethods {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append() - Adds text at the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert() - Inserts text at a specific position
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // 3. replace() - Replaces a portion of string
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // 4. delete() - Deletes a portion of the string
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // 5. reverse() - Reverses the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. length() - Returns length
        System.out.println("Length: " + sb.length());

        // 7. capacity() - Returns current capacity
        System.out.println("Capacity: " + sb.capacity());
    }
}

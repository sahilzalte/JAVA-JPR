public class LogicalExpressions122 {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        boolean andCondition = condition1 && condition2;
        boolean orCondition = condition1 || condition2;
        boolean notCondition1 = !condition1;

        System.out.println("condition1 && condition2: " + andCondition);
        System.out.println("condition1 || condition2: " + orCondition);
        System.out.println("!condition1             : " + notCondition1);
    }
}

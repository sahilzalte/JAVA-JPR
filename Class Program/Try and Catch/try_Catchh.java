public class try_Catchh {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("The addtion is :" + c);
        } catch (Exception e) {
            System.out.println("We failed to divide.Reason:");
            System.out.println(e);
        }
        System.out.println("End of The Program ");
    }

}

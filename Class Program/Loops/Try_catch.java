public class Try_catch {
    public static void main(String[] args) {
        String[] big_b = { "MsDhoni", "Tata", "Elon", "mukesh", "mark", "ronaldo" };
       

        //To Continue Program with Error to avoid Program Stop
        try
        {
            System.out.println(big_b[6]); //Suppose This is an error 
        }
        catch(Exception E)
        // This continue with the Error and show Error message
        {
            System.out.println(E);
        }
        // And this will be continue to display
        System.out.println("Sahil");
    }
}

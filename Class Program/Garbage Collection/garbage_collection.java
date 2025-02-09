public class garbage_collection {
    
    public void finalize(){
        System.out.println("Garbage Collection.");
    }
    public static void main(String[] args) {
        garbage_collection g1 = new garbage_collection();
        garbage_collection g2 = new garbage_collection();
        g1 = null;    
        g2 = null;    
        System.gc();    
    }

}

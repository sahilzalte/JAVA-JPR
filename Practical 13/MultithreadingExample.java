public class MultithreadingExample {
    public static void main(String[] args) {
        // Creating thread using Thread class
        MyThread thread1 = new MyThread();
        
        // Creating thread using Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        
        // Starting both threads
        thread1.start();
        thread2.start();
    }
}

// Thread class implementation
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class: " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Runnable interface implementation
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Interface: " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

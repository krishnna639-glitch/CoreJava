

class samplet1 extends Thread {
    public void run() {
        System.out.println(" child-Thread is running");
    }
}

public class sample {

    
    public static void main(String args[]) {
        System.out.println("Thread main is running");
    
        samplet1 t1 = new samplet1();
        t1.start();
    

        System.out.println("Thread main is executing");   
        System.out.println("Thread main is ended");
    }
}
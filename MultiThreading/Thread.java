package MultiThreading;

public class Thread implements Runnable {
    
    @Override
    public void run(){
        System.out.println("Hello There. What are you doing..?");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread();
        
        t1.run();
        System.out.println("NO Way man..");
    }
}

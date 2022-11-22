package MultiThreading;

public class MultiA extends Thread {
    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Inside run mehtod");
        }
    }
    public static void main(String[] args) {
        MultiA m = new MultiA();

        // m.run();
        // m.start();

        for (int i=0; i<5; i++){
            System.out.println("Inside main method..");
        }

        System.out.println("end of main");
    }
}

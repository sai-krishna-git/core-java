package multithreading;

public class Thread1 extends Thread {
    Thread1(String name){
        super(name);
        System.out.println("Inside Thread1 constructor");
    }
    public void run(){
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

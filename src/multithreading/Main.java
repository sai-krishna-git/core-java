package multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main started");
//        Thread thread1 = new Thread1("thread1");
//        Thread2 thread2 = new Thread2();
//        Thread th2 = new Thread(thread2);
//        Thread th3 = new Thread(thread2);
//        thread1.setDaemon(true);
//        th3.start();
//        thread1.start();
//        th2.start();
        Stack st = new Stack();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                st.push();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                st.pop();
            }
        });
        t1.start();
        t2.start();
        System.out.println("Main ended");
    }
}

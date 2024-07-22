package multithreading;

public class Stack {
    int idx = 0;
    //synchronized for a method uses the curr obj as lock.
    //We cannot use primitives as locks;
    synchronized void push(){
        idx++;
        System.out.println("push: "+idx);
    }
    void pop(){
        synchronized (this) {
            idx--;
            System.out.println("pop: " + idx);
        }
    }
}

package thread;

public class ThreadTest {
    //By Thread class
    //By Runnable Interface
    public static void main(String[] args) {
        ThreadByClass tByC = new ThreadByClass();
        tByC.start();

        ThreadByInterface tByI = new ThreadByInterface();
        Thread t = new Thread(new ThreadByInterface());
        t.start();
    }
}
class ThreadByInterface implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Interface");
        }
    }
}

class ThreadByClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
    
    void test(){
        System.out.println("test");
    }
}

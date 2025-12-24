package oop.abstraction;

public class Test {
    int a;
    static int x = 1000000000;
    static int y = 1000000000;
    public static final int aa = x*y;
    public static final int bb = (int) 10.68;
    
    
    void m(){
        System.out.println("hello");
    }

    
    public static void main(String[] args) {
        Car t = new Toyota();
        t.accelarate();
        t.engine();
    }
}

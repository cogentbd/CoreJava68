package oop.inheritance;

//super class
public class Super {

    int supA;
    protected double d = 10.102;
    static float f;
    
    public Super() {
        System.out.println("super-class constructor");
    }
    
    public Super(int i) {
        System.out.println("super-class constructor 10");
    }
    
    void supMethod(){
        System.out.println("supMethod");
    }
    
    void test(){
        System.out.println("super :: test");
    }
}

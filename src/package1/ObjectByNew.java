package package1;


import java.util.Date;

public class ObjectByNew {
    public static void main(String[] args) {
        int ii;
        int i = 10;
        A a = new A();
        System.out.println(a);
        a.test();
        a.test1();
        
        new A().test();
        new A().test1();

        System.out.println(new Date());
    }
}


class A {
    void test(){
        System.out.println("testing....");
    }
    void test1(){
        System.out.println("testing1....");
    }
}
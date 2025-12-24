package package2;


public class JavaTest { 
    int i;
    void t(){}
    static class Test {
        static int a;
        double d;
        
        public static void main(String[] args) {
            System.out.println(a);
        }
    }
   
    public static void main(String[] args) {
        //System.out.println(i);
        
        JavaTest jt = new JavaTest();

        Test t = new Test();
        System.out.println(JavaTest.Test.a);
      
    }
}

class A {
    public static void main(String[] args) {
        System.out.println("A");
    }
}

class B {
    public static void main(String[] args) {
        System.out.println("test");
    }
}
package package2;

public class TestClass {
    int a = 10;
    static int b = 15;
    
    static {
        System.out.println(TestClass.b);
        v();
    }
    
    static int v(){
        System.out.println("v");
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println();
        TestClass.v();
        System.out.println("hello");
    }  

}

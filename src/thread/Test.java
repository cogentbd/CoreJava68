package thread;

public class Test {
    
    void x(){System.out.println("X");}
    void y(){System.out.println("Y");}
    
    public static void main(String[] args) {
        Test tt = new Test();
        for (int i = 0; i < 5; i++) {
            tt.x();
        }
        for (int i = 0; i < 5; i++) {
            tt.y();
        }
        
        A a = new A();
        a.x();
        B b = new B();
        b.y();
    }
}

class A{
    void x(){System.out.println("X");}
}
class B{
    void y(){System.out.println("Y");}
}

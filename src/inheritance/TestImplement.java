package inheritance;

public class TestImplement implements TestA, TestB{ // Multiple inheritance

    
    public final int abc;
    String a;
    TestImplement(){
        abc = 10;
        //x=30;
    }
    
    @Override
    public void print() {
        System.out.println("Printing......");
        //System.out.println(x);
    }

    @Override
    public void printx() {
        //
    }  
    
    
    public static void main(String[] args) {
        TestImplement ti = new TestImplement();
        ti.print();
        //System.out.println(x);
       AbstractExample ae = new AbstractExample() {
            @Override
            public void abstractMethod() {
                System.out.println("abstract method");
            }
        };
       
       TestA ta = new TestA()
       {
            @Override
            public void print() {
                System.out.println("hello");
            }
        };
        ta.print();
        ae.simpleMethod();
    }

    
}

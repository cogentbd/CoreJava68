package review.StaticVsObject;

public class StaticClass {
    static int a;
    static int b;
    double d;
  
    static int getSum(){
        int c = a+b;
        return c;
    }
    
    public static void main(String[] args) {
        int i = StaticClass.getSum();
        StaticClass sc = new StaticClass(); // object
         
        System.out.println(sc.a);
        
    }
}

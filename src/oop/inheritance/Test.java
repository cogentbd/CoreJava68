package oop.inheritance;


//is-a relationship
//has-a relationship (two types)
//co-variant return
public class Test {
    
    public static void main(String[] args) {
       //Super ss = new Super();
       Sub s = new Sub();
       System.out.println(s);
       s.supMethod();
       s.subMethod();
       s.test();
 
       //Super ss = new Sub();
       //ss.test();

    }
}

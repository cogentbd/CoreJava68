package package1;

class PrimitiveType {
    // properties - variables
    // methods - functions 
    protected final int a = 10;
    
    public int test(){
        return 0;
    }
    
    void tst(){
        
    }
    
   public static void main(String[] args) {
       
       //test();
       
       
       int a = 10;
       long l = 10L;
       
       float f = 10.021F;
       double d = 10.010;
       
       int i;
       i = 10;
       boolean b = true;
       char c = 'a';
       int s = a + i;
       //System.out.println(s);
       
       //casting widening narrowing
       // up casting down casting
       int ia = 10;
       long il = 20; //Widening Casting
       
       long tst = ia;
       int test = (int) il; //Narrowing Casting 
       
       final double MY_PI = 3.1416; //constant
 
       // access modifier
       // public, private, protected, default
       
       
   }
}
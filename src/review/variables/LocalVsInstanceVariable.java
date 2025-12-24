package review.variables;


public class LocalVsInstanceVariable {
    int a = 10; 
    double d;
    
    int add(){ 
       return 8;  
    }
    
    void calculate(){
        double dd;
        System.out.println(dd = 2);
        int aa = add();
        System.out.println(aa);
    }
    
    public static void main(String[] args) {
        LocalVsInstanceVariable v = new LocalVsInstanceVariable();
        v.calculate();
       
    }
}

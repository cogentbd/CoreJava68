package review.variables;


public class StaticVsNonStaticVariable {
    
    int i;
    double d;  //object
    
    static int sum;
    static double dd; //class
    
    int calculate(){ // nonstatic = static+nonstatic
        System.out.println(sum);
        return 5;
    }
    static int calculateSum(){ 
        //System.out.println(i);
        return 15;
    }
    
    public static void main(String[] args) {
        System.out.println(sum);
        StaticVsNonStaticVariable st = new StaticVsNonStaticVariable();
        System.out.println(st.d);
    }
    
    
}

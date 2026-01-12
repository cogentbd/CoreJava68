package package1;

public class WrapperClass {
    int a;
    static int aa;
    
    
    public static void main(String[] args) {
        WrapperClass wc = new WrapperClass();
        System.out.println(wc);
        
        
        int a = 10;
        String s = "10";
        
        Integer i = new Integer(10);
        System.out.println(i);
        
        Float f = new Float(0.00);
        System.out.println(f);
        
        Double d = new Double(0.4);
        System.out.println(d);
        
        
        int aa = 10;
        Integer aai = new Integer(10);
     
    }
}


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

class P {
    public P() {
    }
}
class C extends P {
    public C() {
    }
    class D{}
}
public class Test{
    
    static String s45;
    static StringBuffer sbs;
        public static void main(String[] args) {
          /*
          System.out.println(p instanceof P); //true
          System.out.println(p instanceof C); //false
          
          System.out.println(pp instanceof P); //false
          System.out.println(pp instanceof C); //true
          */
          
          String s1 = "Hello";
          String s2 = "Hello";
          String s3 = new String("Hello");
          String s4 = s3;
//          
//            System.out.println(s2 == s4); //false
//            System.out.println(s4.equals(s2)); //true
//            System.out.println(s1.equals(s3)); //true
//            System.out.println(s1 == s2); //true
//            
            String s = new String("9");

            
            
            Integer iaa= new Integer("10");
            int ia = iaa; //autoboxing
            
            int x = 10;
            Integer ix = x; //unboxing
            
//            System.out.println(ia);
//            System.out.println(ix);
            
            
            int arr[] = new int[5];
            //System.out.println(arr.length);
            arr[2] = 2;
            arr = new int[10];
            //System.out.println(arr[2]);
            
            Integer arr2[] = {10, 20, 30};
                        //String methods
            String str = "Hello";
            
            //System.out.println(str.indexOf(0));
            //System.err.println("hello");
            
            int a[][] = new int[10][5];
            
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = j;
                }
            }

            
            for (int is : a[6]) {
                //System.out.println(is);
            }
            //System.out.println(Arrays.deepToString(a));
            
            StringBuffer sb = new StringBuffer();
            //sb = "Hello";
            System.out.println(sb); 
            
            String m = new String();
            //m = "Hello";
            System.out.println(m);
            
            StringBuilder sbf = new StringBuilder();
            //sbf = "Hello";
            System.out.println(sbf);
            
            System.out.println(sbs);
           
            CharSequence cs = new String();
            CharSequence cs1 = new StringBuilder();
            CharSequence cs2 = new StringBuffer();
            
           
        }
        
        
}


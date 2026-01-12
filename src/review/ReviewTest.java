package review;

import java.util.List;  //wildcard import
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReviewTest implements Cloneable{
   static int s = 10;
        /**
            *is-a / has-a relationship
            co variant return
            non access modifier
            
            exp propagation
            priorityqueue, hashtable,hashmap
            assert
            immutability
            enum
            memory mgt


            **Comparable Clonable
            **isdigit
            
            **staic
            **string buffer builder

             ** wrapper class 
             ** string methods
             ** type casting
             ** object casting
             ** boxing unboxing
             ** instanceof
             * static import vs wildcard
             ** bigint bigdecimal
             ** String pool
         */

   static void test(){}

    public static void main(String[] args) {
        Double d1 = 100.100;
        double dd = d1;
        int aa = (int) dd;

        
        int a = 10; //32
        double d = 10.10; //64
        
        List l = new java.util.ArrayList();
        
        String s = "Hello"; //String pool
        String ss = "Hello";
        
        
        
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        
        

        System.out.println(s.getBytes());
        System.out.println(ss.getBytes());
        
        ReviewTest r = new ReviewTest();
       try {
          ReviewTest r1 = (ReviewTest) r.clone();
           System.out.println(r == r1);
       } catch (CloneNotSupportedException ex) {
           Logger.getLogger(ReviewTest.class.getName()).log(Level.SEVERE, null, ex);
       }
     

        
    }

}


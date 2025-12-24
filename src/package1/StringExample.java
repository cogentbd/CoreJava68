package package1;

public class StringExample {
    String s = "Hello";
    int i = 10;
    //Strings in Java are immutable
    public static void main(String[] args) {

        //String
        String ss = new String("hello");
     
        String ss1 = new String("hello");
        System.out.println(ss == ss1);
        
        String s1 = "hello"; //String pool
        String s2 = "hello";
        String s3 = "hello";
        System.out.println(s1 == s2);
        //System.out.println(s1.equals(s2));
        

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            ss.concat("world");
        }
        long end = System.currentTimeMillis();
        System.out.println("String " + (end - start));

        //StringBuffer
        StringBuffer sb = new StringBuffer("hello");
        long startsb = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            sb.append("world");
        }
        long endsb = System.currentTimeMillis();
        System.out.println("StringBuffer " + (endsb - startsb));
        
        //StringBuilder
        StringBuilder sbl = new StringBuilder("hello");
        long startsbl = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            sbl.append("world");
        }
        long endsbl = System.currentTimeMillis();
        System.out.println("StringBuilder " + (endsbl - startsbl));

    }
}

package package1;

public class StringMethods {
    
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(6));
        System.out.println(str.concat(" 2"));
        System.out.println(str.indexOf('W'));
        System.out.println(str.lastIndexOf("o"));
        
        String str1 = "Hello World";
        
        String s = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s == s2); //false
        System.out.println(str == str1); //false
        System.out.println(str.equals(str1));
        
        System.out.println(s.equals(s2)); //true
        
        System.out.println(str.trim());
        
        int a = 1;
        System.out.println(String.valueOf(a));
        System.out.println(Integer.valueOf("10"));
        System.out.println(Double.valueOf("10.00"));
        //substring
        
        String val = "10";
        System.out.println(Integer.parseInt(val));
        System.out.println("Hello");
        //Escape Sequences
    }
}

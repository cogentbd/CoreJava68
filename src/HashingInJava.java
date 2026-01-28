
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import sun.security.provider.MD5;

public class HashingInJava {
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // variable size input
        // fixed size output
        
        String input1 = "Hello";      
        String output1 = "123"; //hash value, digest
        
        
        String test1 = "Test";
        String test2 = "Test";
        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());
        
        System.out.println(test1.equals(test2));
        
        String str = "hjsdfhgasjkfhjkfhlkjfhasdfkjlsjnhflkasdnjasdfasdfasdfashjsdfhgasjkfhjkfhlkjfhasdfkjlsjnhflkasdnjasdfasdfasdfashjsdfhgasjkfhjkfhlkjfhasdfkjlsjnhflkasdnjasdfasdfasdfashjsdfhgasjkfhjkfhlkjfhasdfkjlsjnhflkasdnjasdfasdfasdfashjsdfhgasjkfhjkfhlkjfhasdfkjlsjnhflkasdnjasdfasdfasdfashjsdfhgasjkfhjkfhlkjfhasdfkjlsjnhflkasdnjasdfasdfasdfashjsdfhgasjkfhjkfhlkjfhasdfkjlsjnhflkasdnjasdfasdfasdfas";
        System.out.println(str.hashCode());
        
        
        String masud = "Test";
        String Tashrif = "Test";
        
        int mhashcode = masud.hashCode();
        int thashcode = Tashrif.hashCode();
        
        System.out.println();
        System.out.println(Tashrif.hashCode());
        
        Object o = new Object();
        System.out.println(o.hashCode());
        
        String t1 = new String("Hello");
        String t2 = "Hello";
        
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        
        
        
        
        String input = new Scanner(System.in).nextLine();
        String output = "";
        MessageDigest digest = MessageDigest.getInstance("AES");
        byte[] byt = digest.digest(input.getBytes());
        
        for (int i = 0; i < byt.length; i++) {
            char c = (char) byt[i];
            output += String.valueOf(c);
        }
        System.out.println(output);
    }
}

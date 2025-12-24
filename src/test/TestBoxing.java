package test;


public class TestBoxing {
    public static void main(String[] args) {
        String s = "Dhaka";
        s.concat("Dhaka");
        System.out.println(s);
        
        StringBuffer sb = new StringBuffer("Dhaka");
        sb.append("Dhaka");
        System.out.println(sb);
    }
 
}

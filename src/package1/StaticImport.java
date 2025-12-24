package package1;

//package
//import

public class StaticImport {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println(sc);
        java.util.Date d = new java.util.Date();
        System.out.println(d.getDate());
    }
}

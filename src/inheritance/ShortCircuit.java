package inheritance;

public class ShortCircuit {

    static int a = 5;
    static int b = 6;
    static boolean status = false;

    public static void main(String[] args) {
        
        if (b < 7 && (status = true)) { //&& ||
            System.out.println("if " + status);
        } else {
            System.out.println("else " + status);
        }
        System.out.println("output... "+ status);
    }
    
}

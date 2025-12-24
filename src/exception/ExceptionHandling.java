package exception;

//try-catch-finally

import java.util.Scanner;

//throw
//throws
public class ExceptionHandling {
    
    public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Value for X : ");
    int x = s1.nextInt();
    System.out.println("Value for Y : ");
    int y = s1.nextInt();
    int result = 0;
    int[] arr = new int[2];
        try {
            result += x/y;
            arr[0] = x;
            arr[1] = y;
            //System.exit(0);
            System.out.println(arr[2]);
        } catch (ArithmeticException e) { //lower to higher
//            System.out.println(e);
//            System.out.println("Value for Y is not compatible: Enter greater than 1 ");
//            y = s1.nextInt();
//            result += x/y;
            System.out.println("Arithmetic exception solved");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array exception solved");
        } catch (Throwable e) {
            System.out.println("Runtime exception");
        } finally {
            System.out.println("finally");
        }
        
        System.out.println(result);
        System.err.println("EoF");
        System.out.println("Git Testing");
    }
}

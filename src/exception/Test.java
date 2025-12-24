package exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Please input your age : ");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[55];
       
        try {
            //System.out.println(1/0);
            for (int i = 0; i < 51; i++) {
                arr[i] = i;
            }
            System.out.println(arr[59]);
        } catch (Exception e) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println(e);
        }
        
        int age = sc.nextInt();
        if(age<18) System.out.println("You are not a voter");
        else System.out.println("You are a voter");
    }
}

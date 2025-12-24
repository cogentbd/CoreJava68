package package1;



// A Class is like an object constructor, or a "blueprint" for creating objects

import java.util.Scanner;

// Member of a class :: properties & methods & inner classes
public class DataType {
    // instatnce variable
    int a, b; //directly related to the object of the class
    double d = 20.021, e = 45.25;
    
    // access modifier :: public, protected, private, default
    public char c; // everywhere inside the project
    private float f; // only inside the class
    protected String s; // same package
    
    public long method1(){ //all methods must have return types
        return 0;
    }
    private float method2(){
        return 0.0F;
    }
    //method without a return type
    protected void methodWithoutType(){
        System.out.println("test");
    }
    
    static int val1; //directly related to the class
    //Class.property
    //Class.method
     static void test(){}
     
    public static void main(String[] args) {
        System.out.println("Please input a value");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a);

    }
    
    
}
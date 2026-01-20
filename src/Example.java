public class Example {

    static void test(){
        System.out.println("test");
        test();
    }
    
    public static long factorial(int n) {
    if (n == 0) // Base case
        return 1;
    else
        return n * factorial(n - 1); // Recursive call
    }
    
    //lamda expression
    
    public static void main(String[] args) {
        test();
    }
}

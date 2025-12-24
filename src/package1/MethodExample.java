package package1;

public class MethodExample {
    
    int sum(int a, int b){
       return 0; 
    }
    
    double sum1(int a, int b){
       sum(101, 105);
       test();
       return 0.0; 
    }
    
    static void test(){
        System.out.println("test");
    }
    
    public static void main(String[] args) {
        test();
    }
  
}

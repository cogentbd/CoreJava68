package thread;

class A implements Runnable{
    @Override
    public void run() {
        System.out.println("run");
    }
}

public class Test {
       
        static A obj = new A();
        int x = 11;
        
        static int a = 10;
        static Test test(){
            return new Test();
        }
        
        
     public static void main(String[] args) {
         
         System.out.println(Test.obj);
         
         System.out.println(Test.a);
         System.out.println(Test.test());
        
     }
    

    

}


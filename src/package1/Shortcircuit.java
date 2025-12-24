package package1;

public class Shortcircuit {


        
    public static void main(String[] args) {
        int a = 10;
//        if(a < 11 && a< 12 || a == 11){
//            System.out.println("if");
//        }else{
//            System.out.println("else");
//        }
//
//        if(false || true || true){
//            System.out.println("if");
//        }else{
//            System.out.println("else");
//        }
//        
        int s = 5;
        int t = 6;
        boolean b = false;
        
        if( (s<t) && (b = true) ){
            System.out.println("if");
        }else{
            System.out.println("else");
        }
        
        System.out.println("Short Circuit " + b);
        
        
    }
/*    
The while loop and for loop are called pretest loops because the continuation condition
is checked before the loop body is executed. The do-while loop is called a posttest loop
because the condition is checked after the loop body is executed.
*/
}

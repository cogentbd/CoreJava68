package exception;

//throw is being used to throw an object of any class of Exception Framework
//Syntax :: throw objectOfException;
//throws :: throws exception at method level
public class ExceptionTesting {
    
    static void testException() throws Exception{
        System.out.println(1/0);
    } 
    
    static void test(){
       System.out.println("test");
       throw new A();
    }
    
    public static void main(String[] args) throws Exception{
        

        try {
            test();
        } catch (A ex) {
            System.out.println("test " +ex);
        } 

testException();
        try {
            
             try {
                 
                 try {
                     
                 } catch (ArithmeticException e) {
                 }catch(Exception e){
                 
                 }finally{
                 
                 }
            } catch (Exception e) {
            }finally{
             
             }
        } catch (Exception e) {
            
        }finally{
        
        }
        
    }
}

class A extends ArithmeticException{
    
}
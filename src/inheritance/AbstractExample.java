package inheritance;

public abstract class AbstractExample {
//class must be abstract if only one method of the class is abstract

    int a;
    public AbstractExample() {
   
    }
    
    public void simpleMethod(){
        System.out.println("Simple Method  " + a);
    }
    public abstract void abstractMethod(); //abstract methods cannot have a body part

    
}

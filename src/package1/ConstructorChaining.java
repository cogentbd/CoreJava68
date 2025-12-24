package package1;

public class ConstructorChaining {

    int i;
    
    public ConstructorChaining() {
       
    }
    
    public ConstructorChaining(int a) {
        this();
    }
    
    public ConstructorChaining(double d) {
        this(10);
    }
    
    public ConstructorChaining(float f) {
        this(10.10);
    }
    
    public ConstructorChaining(String s) {
        this(10.10F);
        System.out.println("");
    }
    
    void t(){
       this.i = 0;
    }
    
    public static void main(String[] args) {

    }
}

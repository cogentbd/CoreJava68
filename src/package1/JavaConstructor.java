package package1;


public class JavaConstructor {
    static int i = 10;
    double d;
    float f;
    
    private JavaConstructor() {  
        this.d = 12.25;
        this.f = 15.15F;
        System.out.println("private constructor");
    }  
    
    public JavaConstructor(int a){
        new JavaConstructor();
    } 
    
    void v(){}    
    public static void main(String[] args) {
        JavaConstructor jc = new JavaConstructor(15);
        System.out.println(jc.d);
        System.out.println(jc.f);
        
        JavaConstructor jc1 = new JavaConstructor();
        System.out.println(jc1.d);
        System.out.println(jc1.f);
    }
}

class T {
    void test(){
        JavaConstructor jc;
        jc = new JavaConstructor(0);
        jc.v();
        System.out.println(JavaConstructor.i);
    }
}

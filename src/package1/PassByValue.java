package package1;

public class PassByValue {
    public static void main(String[] args) {
        
        int a = 10;
        changeValue(a);
        System.err.println(a);
        
        B b = new B();
        b.setA(15);
        System.out.println(b.getA());
        changeRef(b);
        System.out.println(b.getA());
    }
    static void changeValue(int a){
        System.out.println(a);
        a = 30;
    } 
    
    static void changeRef(B b){
        b.setA(20);
    } 
}

class B {
    private int a;
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}
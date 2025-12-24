package package1;


class X {
    int a;

    public X(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
}


public class PassByValue2 {
    public static void main(String[] args) {
        X x = new X(15);
        System.out.println(x.getA());
        modifyValue(x);
        System.out.println(x.getA());
    }
    
    static void modifyValue(X x){
        System.out.println(x.getA());
        x.setA(x.getA() * 2);
        System.out.println(x.getA());
    }
}

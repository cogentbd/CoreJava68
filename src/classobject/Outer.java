package classobject;

//class.property : static
//object.property : non static
class OuterClass {
    int a; //
    static double d;//
    
    class InnerNonStaticClass {
        int a = 11; //
        //static int b = 16; // not possible
    }
    static class InnerStaticClass{ //
        static int aa = 10; //
        int ab = 15;
    }
}

public class Outer {
    public static void main(String[] args) {
        System.out.println(OuterClass.d); //static
        System.out.println(OuterClass.InnerStaticClass.aa); //inner static class
        
        OuterClass o =  new OuterClass();
        System.out.println(o.a); //non-static
        System.out.println(o.d); //static
        
        OuterClass.InnerNonStaticClass io = o.new InnerNonStaticClass(); //inner non static class
        System.out.println(io.a);

        OuterClass.InnerStaticClass is = new OuterClass.InnerStaticClass();
        System.out.println(is.ab);
        
        
    }
}



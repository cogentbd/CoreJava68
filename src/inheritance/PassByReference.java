package inheritance;

class ReferenceClass{
    int a = 20;
    void passByValue(int a){ //primitive type
        a += 10;
        System.out.println("Pass by Value is :  " + a);
    }
    void passByRef(ReferenceClass r){ //class type
        r.a += 10;
        System.out.println("Pass by Ref is :  " + a);
    }
}

public class PassByReference {
    public static void main(String[] args) {
        ReferenceClass rc = new ReferenceClass();
        rc.passByValue(50); //pass by value works on primitive type data
        rc.passByRef(rc);  //pass by object works on the class type data
    }
}

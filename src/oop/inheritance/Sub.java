package oop.inheritance;

//extends
//sub class
//Java doesn't support multiple inheritance
public class Sub extends Super {

    int subA;
    
    public Sub() {
       //super(10);
       System.out.println("sub-class constructor");
    }
    
    void subMethod(){
        System.out.println("subMethod");
    }
    
    @Override
    void test(){
        System.out.println("sub :: test");
    }
}

/*
class Super1{ //parent
    int a;
    void v(){};
}
class Super2{ //parent
    int b;
    void x(){};
}

class Sub1 extends Super1{ //child
}

class Sub2 extends Super1 { //child
}

class Sub3 extends Super1 { //child
}

class SoSub extends Sub1{
    
}
*/
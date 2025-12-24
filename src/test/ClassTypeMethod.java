package test;

class Address{
  
}

public class ClassTypeMethod {
    
    int sum(){
        return 10+6;
    }
    
    Address getAddress(){
        //Address a = new Address();
        //return a;
        return new Address();
    }
    
    void doSum(){
        return;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

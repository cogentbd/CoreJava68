package classobject;

import inheritance.TestA;

public class ClassType {
    int a;
    static Fruit f;
    static Fruit ff(){
        return new Fruit();
    }
    int aa(){
        return 0;
    }  
    static {
    
    }
    
    public static void main(String[] args) {
        System.out.println(f);
        int a = 0;
        Fruit f = ff();
        
        
        
    }
    
    Apple apple; //null
    Apple app = new Apple();
    
    Apple appleMethod(){
      return null;  
    }
    Apple appleMethod1(Apple a){
      return new Apple();  
    }
    
    Fruit fruit(){
        return new Apple();
    }
    Fruit ff2 = new Apple();
    
   
}

class Fruit {}
class Apple extends Fruit{}
package casting;

import inheritance.Person;

public class ToStringExample{

    String s1 = "Hello";
    String s2 = "World";
    
    @Override
    public String toString() {
        return s1 + " " + s2;
       // return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

  // toString() method is a class' object's String representation
    public static void main(String[] args) {
        ToStringExample ts = new ToStringExample();
        System.out.println(ts.toString());;
        
        Person p = new Person("Mr. A", "Dhaka", 25, 2000.12);
        System.out.println(p.toString());
    }

}

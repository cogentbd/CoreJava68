package oop.encapsulation;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        //c1.model = 950;
        c1.setModel(950);
        c1.setName("Maruti");
        c1.setPrice(100.02041);
        System.out.println(c1);
        
        Car c2 = new Car();
        //c2.model = 650;
        System.out.println();
        
        //System.out.println(c1.model);
        //System.out.println(c2.model);
        
        Car c3 = new Car();
        //System.out.println(c3.model);
       
        System.out.println(c2);
        System.out.println(c3);
        
        
        

    }
}

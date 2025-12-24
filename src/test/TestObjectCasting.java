package test;

class Animal {

    int health = 100;
}

class Cat extends Animal {
}

public class TestObjectCasting {

    public static void main(String[] args) {
        Animal aml = new Animal();
        Cat c = new Cat();
        Object o = aml; // Implicit casting
        //Upcasting is implicit and safe
        aml = c;// no cast needed for upcasting
        /**Converting an instance of a subclass to an 
         * instance of a superclass loses the information.
         down-casting is always explicit*/
        c = (Cat) aml;// must cast explicitly for downcasting
        System.out.println(c.health);

    }
}

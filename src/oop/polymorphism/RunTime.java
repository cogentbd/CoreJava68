package oop.polymorphism;

//method overriding
//Dynamic Binding
public class RunTime {

}

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Dogs can run and walk");
    }
}

class TestDog {
    public static void main(String args[]) {
        Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog();    // Animal reference but Dog object

        a.move(); // Calls method in Animal class
        b.move(); // Calls method in Dog class (determined at runtime)
    }
}
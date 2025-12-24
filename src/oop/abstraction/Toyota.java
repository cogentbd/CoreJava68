package oop.abstraction;

public class Toyota extends Car implements Vehicle{

    @Override
    void accelarate() {
        System.out.println("Toyota is running");
    }

    @Override
    void engine() {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }

    @Override
    public void speed() {
   
    }

    @Override
    public void brake() {

    }

    @Override
    public void consumption() {

    }
}

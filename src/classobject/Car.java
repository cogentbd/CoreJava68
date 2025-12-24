package classobject;

public class Car {
    String name;
    double price;

    public Car() {
    }
    
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    void start(){
        System.out.println(name + " " + price);
    }
    void brake(){
        System.out.println(name + " is braking");
    }
    
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", 2500.25);
        tesla.start();
        //tesla.brake();
        
        Car toyota = new Car("Toyota", 3500.25);
        toyota.start();
       // toyota.brake();
        
        Car ftuner = new Car("Fortuner", 5600.45);
        ftuner.start();
        //ftuner.brake();
        
        Car c = new Car();
        c.name = "Tesla";
        c.price = 100.022;
        System.out.println(c.price);
        
    }
}

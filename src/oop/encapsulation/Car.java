package oop.encapsulation;

public class Car {
    private String name;
    private int model;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   @Override
    public String toString() {
        return name + " " + model + " " + price; //To change body of generated methods, choose Tools | Templates.
    }
 

}

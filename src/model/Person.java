package model;

public class Person {
    private String name;
    private String address;
    private int age;
    private double salary;

    public String getName() { //getter methods are with property's return type
        return name;
    }

    public void setName(String name) { //setter methods are always void
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }  
    
}

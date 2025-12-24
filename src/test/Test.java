package test;


public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("A", 25, 50, 20);
        Person p2 = new Person("B", 15, 30, 10);
        System.out.println(p1.getName()+" "+ p1.getArea());
        System.out.println(p2.getName()+" "+p2.getArea());
        System.out.println(p1.getAge());
    }
}

class Person{
   String name;
   int age;
   int weight;
   int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
    
   
    public int getArea(){
        return weight*height;
    }  

}

package collection;

import java.util.ArrayList;
import java.util.List;

public class Test {
    
    static Person[] getPersons(Person p[]){
        return p;
    }
    
   static List getList(List l){
        return l;
    }
    
    public static void main(String[] args) {
        Person jodu = new Person("Jodu", 20, 20000.00);
        Person modhu = new Person("Modhu", 22, 22000.00);
        Person kodu = new Person("Kodu", 24, 24000.00);
        
        Person ppls[] = new Person[3];
        ppls[0] = jodu;        
        ppls[1] = modhu;        
        ppls[2] = kodu; 
        
        Person pp[] = getPersons(ppls);
        
        for (Person person : pp) {
            System.out.println(person);
        }
        
        
        List l = new ArrayList();
        l.add(new Person("", 0, 0));
        l.add(new ChildOfThePerson());
        l.add(new A());
        l.add(new B());
        
        getList(l);
    }
}


class Person {
    private String name;
    private int age;
    private double salary;
    private ChildOfThePerson chl;
    
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + salary;
    }
}

class ChildOfThePerson {


}

class A{}
class B{}
package others;

import model.Person;


//Method Area :: class structure, superclass name, interface name, and constructors.
public class JavaMemoryManagement extends Person/*Method Area*/{ 
   
    public JavaMemoryManagement() {/*Method Area*/
    }
    
    
    
    //initialized by default value
    //instance variable/ primitive type/ field variable/ global scope
    /*
    Heap: is a single area where JVM allocates memory for -Objects, 
    including method code , static variables & instance variables. 
    @ interface - all values in interface are constants i.e final static, 
    so it's stored on Heap only.
    */
    int intValue;
    //static variable
    static int staticValue; //static variables are stored in the PermGen section of the heap
    static final int finalValue = 10; //final variables store in Stack
    //class type property
    //is a relationship
    Person person; //reference of the Person class
    // ClassName.method() is applicaple for static methods
    //String object
    String s = "String value";
    String w = s; //reference of s
    int arr[] = new int[5]; //primitive type array
    static Person persons[] = new Person[2]; //class type
    /*
    Firstly, by "main memory" we mean 'the Java heap, as seen by the JVM'.
    Reading from and writing to stack variables is very fast because the CPU organizes stack memory pretty efficiently.
    */

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static void main(String[] args) {
//local, automatic, temporary, or stack variables
        int a = 10; //local variables are stored in Stack
        Person p = new Person();
        p.setName("Mr. A");
        p.setAddress("Dhaka");
        p.setAge(10);
        p.setSalary(1200.01);

        Person p1 = new Person();
        p1.setName("Mr. B");
        p1.setAddress("Chittagong");
        p1.setAge(520);
        p1.setSalary(1.01);
        
        persons[0] = p; //assign object to class type Array
        persons[1] = p1;
        
        System.out.println(persons[0].getName()); // retrive value from class type array
        System.out.println(persons[1].getName());

        JavaMemoryManagement jm = new JavaMemoryManagement();
        //jm.staticValue = 20; // by object we can access static and not static members
        jm.setPerson(p1);

        System.out.println(jm.getPerson());

        System.out.println(jm.getPerson().getAge() + "  " + jm.getPerson().getAddress());
        /*
            https://findanyanswer.com/where-variables-are-stored-in-java
        */
        
        int aa = 10;
        int bb = 15;
        int cc = aa & bb;
        int dd = aa | bb;
        System.out.println(dd);
        
        
        int z = 10;
        z = 15;
        int arr[] = new int[z];
        arr = new int[10];
    }
}

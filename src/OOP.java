//Encapsulation
class Person {
    private String name;
    private String address;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
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


//Polymorphisom [compile:static:early/Run:dynamic:late]
interface ICombustionEngine {
    public abstract void EngineTypeA();
    public abstract void EngineTypeB();
}    
class EngineType implements ICombustionEngine{
    //----------compile:static:early--------------
    int engine(){return 0;}
    int engine(int a){return 0;}
    double engine(double a){return 0.0;}

    //Run:dynamic:late
    @Override
    public void EngineTypeA() {}
    @Override
    public void EngineTypeB() {}

}

//Abstraction
abstract class X {
    void howToplay(){};
    abstract void play();
}
interface IX {
    void ixa();
    void ixy();
}
class TestAbstraction extends X implements IX{

    @Override
    void play() {}

    @Override
    public void ixa() {}

    @Override
    public void ixy() {}
}

//inheritance
class Parent {
    String myLand(){
        return "I am owner";
    }
    void myAnotherLand(){}
}

class SecondChild extends Parent{}
interface IXA {}
interface IXY extends IXA {}

class Child extends Parent implements IXA, IXY{
    @Override
    String myLand() {
        return "I am owner";
    }
    void myOwnLand(){}
    
    Parent myParent(){
       return new Child();
    }
}


class TestMyLand {
    public static void main(String[] args) {
          Child c = new Child();
          c.myLand();
          Parent pc = new Child();
          pc.myLand();
          Parent p = new Parent();
          p.myLand();
          Parent parent = c.myParent();  
         
          IXA aa = new Child();
          
    }
}
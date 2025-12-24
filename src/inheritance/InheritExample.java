package inheritance;

class Parent {

    static int parentA;
    static int parentB;


    
//    public Parent() { //no argument constructor
//        //parentA = 10;
//        System.out.println("Parent Constructor");
//    }
    //this refers to current class Object
    public Parent(int parentA, int parentB) { //argument constructor
        this.parentA = parentA; //ambuguity problem //pointer concept
        this.parentB = parentB;
        System.out.println("Argument Parent Constructor " + (parentA+parentB));
    }
    static void showData() {
        System.out.println("Parent Data : " + (parentA + parentB));
    }
  
}

class Child1 extends Parent {

    static int child1A;
    static int child1B;

    public Child1() {
        super(10,20);  // must be called if a argument constructor exists in parent
        System.out.println("Child Constructor");
        
    }

//    static void showData() {
//        System.out.println("Child1 Data : " + (child1A + child1B));
//    }
//    
//    void valueCheck(Parent p){
//        System.out.println("Parent class " + p.parentA);
//    }
}

class InheritExample {

//    public InheritExample() {
//        //super();
//    }

    public static void main(String[] args) {
        //Parent p = new Parent(10, 20);
        Child1 c = new Child1();
 
    }
}

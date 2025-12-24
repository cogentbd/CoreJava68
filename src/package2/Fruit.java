package package2;

class Fruit {
    static String s;
    String name;
    double price;
    
    //constructor overloading
    public Fruit(){
        System.out.println("Constructor is being called");
    }
    
    public Fruit(int a){
        System.out.println("Constructor is being called");
    }
    
    public Fruit(int a, int b){
        System.out.println("Constructor is being called");
    }
    
    public Fruit(double b, int a, char c){
        System.out.println("Constructor is being called");
    }
    
    public Fruit(int a, double b, char c){
        System.out.println("Constructor is being called");
    }
    
    String howToEat(String howto){
        System.out.println("howToEat");
        return howto;
    }
    
    void test(){}
}


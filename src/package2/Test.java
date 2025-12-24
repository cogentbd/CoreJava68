package package2;

public class Test {
    
    int a;
    static int b;
    
    static void test(){
        System.out.println(b);
    }
    
   
    
    public static void main(String[] args) {
        System.out.println(Fruit.s);
        
        
        Fruit apple = new Fruit(5); //constructor
        
        apple.name = "Apple";
        apple.price = 150.24;
        apple.howToEat("Eating apple");
        apple.s = "";

        
        Fruit banana = new Fruit();
        banana.name = "Banana";
        banana.price = 500.54;
        banana.howToEat("Eating banana");
        
        System.out.println(apple);
        System.out.println(banana);
        
        
    }
}

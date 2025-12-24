package test;

public class Fruit {

    public static void main(String[] args) {
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();
        if(orange instanceof Fruit){
            System.out.println("true");
        }
    }
}

class Apple extends Fruit {
}

class Orange extends Fruit {
}

class GoldenDelicious extends Apple {
}

class McIntosh extends Apple {
}

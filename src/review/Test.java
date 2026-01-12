package review;


class Base{
        int value = 0;
        Base(){
            System.out.println(value);
            addValue();
            System.out.println(value);
        }
        void addValue(){
            value += 10;
        }
        int getValue(){
            return value;
        }
}
class Derived extends Base{
    Derived(){
        //10
        System.out.println(value);
        addValue();
        System.out.println(value);
    }
    void addValue(){
        System.out.println(value);
        value += 20; //20
  System.out.println(value);
    }
}
public class Test{
    public static void main(String[] args){
        Base b = new Derived();
        System.out.println(b.getValue());
    }
}




package test;


public class EqualsTest {
    int x;

    public EqualsTest(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("eee");
        EqualsTest et = (EqualsTest)obj;
        return this.x==et.x;
    }
    
    public static void main(String[] args) {
        EqualsTest et1 = new EqualsTest(3);
        EqualsTest et2 = new EqualsTest(3);
        System.out.println(et1.equals(et2));
        
    }
}

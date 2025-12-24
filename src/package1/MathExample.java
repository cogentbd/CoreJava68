package package1;

public class MathExample {
    
    static void test(int[] i){
        for (int j : i) {
            System.out.println(j);
        }
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Math.random());
        //Math methods
        int[] arr = {10, 15, 20, 25, 30};
        System.out.println(arr);
        test(arr);
    }
}   

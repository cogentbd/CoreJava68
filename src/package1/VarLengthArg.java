package package1;

public class VarLengthArg {
    
    static void test(String... str){
        for (String s : str) {
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) {
        test("a", "v", "d", "c");
    }
}

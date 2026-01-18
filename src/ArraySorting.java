
import java.util.Arrays;

public class ArraySorting {
    static int[][] t = {{3,1,2}, {6,4,5}, {9,8,7}};
    
    public static void main(String[] args) {
        
        
        try {
            System.out.println("");
            int i = 1/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally{
            
        }
        
        
        
        
        
        //Arrays.sort(t);
        for (int i = 0; i < t.length; i++) {
            int temp[] = t[i];
            Arrays.sort(temp);
            for (int j : temp) {
                System.out.print(j + " ");
            }
            System.out.println("");
            for (int j = 0; j < t[i].length; j++) {
                //System.out.print(t[i][j] + " ");
            }
            //System.out.println(t[0]);
            
        }
    }
}

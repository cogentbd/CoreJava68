package package1;

public class JavaArray {
    
    static int[][] myArr;
    
    
    public static void main(String[] args) {
        System.out.println(myArr);
        
        int a = 10;
        
        int arr1[] = {10, 15, 20};
        
        
        //for-each loop
        for(int temp : arr1){
            System.out.println("Check " + temp);
        }
        
        
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        //
        int[] arr = new int[3];
        //System.out.println(arr);
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 20;
        
        int aa[][] = {{10,12,13,25}, {14,25,56}, {14,20,15}};
        for (int i = 0; i < aa.length; i++) {
            System.out.println(aa[i]);
            for (int j = 0; j < aa[i].length; j++) {
                System.out.println(aa[i][j]);
            }
        }
        //int[][] ar = new int[3][];
        
        
int aaa[][][] = { { {10, 50, 60}, {10, 20}, {50, 60} }, { {10, 15}, {32, 55} }, { {11, 22}}};
          
    }
}

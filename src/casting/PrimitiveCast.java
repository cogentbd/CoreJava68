package casting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maruf Hasan
 */
public class PrimitiveCast {
    
    
    public static void main(String[] args){
    
    //char to int
    char c = 'A';
    int ctoi = c;
    
    System.out.println("char to int cast " +ctoi);
    
    //int to char (big to short value)
    int ii  =65;
    char itoc  = (char) ii;
    System.out.println("int to char cast "  + itoc);
    //another way
    System.out.println(Character.toChars(97));
    
    
    //String to character
    String sss = "welcome";
    char stoc = 'A';
    for(int j =0; j<sss.length(); j++){
        stoc =(char) sss.charAt(j);
        System.out.println(stoc);
    }
    
    //character to string
    char cc  = 'X';
    System.out.println(String.valueOf(cc));
    
    //int to double wedening
    int iii  =5;
    double itod = iii;
    System.out.println(itod);
    
    
    //double to int narrowing
    double dd = 5.4d;
    int dtoi = (int) dd;
    System.out.println(dtoi);
    
    byte b = 127;
    byte ccc =2;
    byte dddd = (byte) (b+ccc);
    System.out.println(dddd);
    

    }
}
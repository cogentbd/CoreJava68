package test;

public class PrimitiveCastExample {

    public static void main(String arg[]) {
        //String to int
        String s = "13";
        int stoi = Integer.parseInt(s);
        //or you can write
        stoi = Integer.valueOf(s).intValue();
        System.out.println("String to int " + stoi);

        //int to String
        int i = 14;
        String itos = Integer.toString(i);
        System.out.println("int to String " + itos);

        //String to double
        String ss = "13";
        double stod = Double.valueOf(ss).doubleValue();
        stod = Double.parseDouble(ss);
        System.out.println("String to Double " + stod);

        //double to String
        double d = 13.5d;
        String dtos = Double.toString(d);
        System.out.println("Double to String " + dtos);

        //String to Long
        //long stolg=Long.valueOf(stringvalue).longValue();

        //Long to String
        //String lgtos=Long.toString(longvalue);

        //char to int
        char c = 'a';
        int ctoi =  c;//no need to explicit cast 
        System.out.println("char to int " + ctoi);

        //int to char
        int ii = 65;
        char itoc = (char) ii;
        System.out.println("int to char "+itoc);
        //int to char another way
        System.out.println(Character.toChars(97));

        //String to Character
        String sss = "welcome";
        char stoc='A';
        for (int j = 0; j < sss.length(); j++) {
            stoc = (char) sss.charAt(j);
            System.out.print(" "+stoc);
        }        
        

        //Character to String 
        char cc = 'X';
        System.out.println("Character to String " + String.valueOf(cc));
        
        //int to double, widening
        int iii = 5;
        double itod = iii;//no need to explicit cast
        System.out.println("int to double "+itod);
        
        //double to int, narrowing
        double dd=5.4d;
        int dtoi = (int)dd;
        System.out.println("double to int "+dtoi);  
        byte b = 127;
        byte ccc=2;
        byte dddd =(byte)(b+ccc);
        int intvalue = 5;
        Integer wint = intvalue;
        int v = wint;

    }
}
//
////Integer code2
// class PrimitiveCastExample {
//
//    public static void main(String arg[]) {
//        String s = "27";
//int i = (int) s;
//        System.out.println(i);
//    }
//}
//Integer to String
//int a=97;
//String s=Integer.toString(a);
//
//String s=""+a;
//
//
//Double to String
//String s=Double.toString(doublevalue);
//
//Long to String
//String s=Long.toString(longvalue);
//
//Float to String
//String s=Float.toString(floatvalue);
//
//String to Integer
//String s="7";
//int i=Integer.valueOf(s).intValue();
//
//int i = Integer.parseInt(s);
//
//String to Double
//double a=Double.valueOf(s).doubleValue();
//
//String to Long
//long lng=Long.valueOf(s).longValue();
//
//long lng=Long.parseLong(s);
//
//String to Float
//float f=Float.valueOf(s).floatValue();
//
//Character to Integer
//char c='9';
//int i=(char)c;
//
//String to Character
//String s="welcome";
//char c=(char)s;

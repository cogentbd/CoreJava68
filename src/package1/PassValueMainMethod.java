package package1;


public class PassValueMainMethod {
    public static void main(String[] args) {
        System.out.println(args.length);
        int sum = 0;
        for (String arg : args) {
            System.out.println(arg);
            //sum += Integer.parseInt(arg);
        }
        //System.out.println(sum);
    }
}


package io;

import java.io.*;

public class BufferedReaderExample {

    public static void main(String[] args) {

        try {
            
            FileReader fr = new FileReader("C:\\Users\\JAVA\\Desktop\\test.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());

            String sCurrentLine;
        
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
            
            
            //br.close();
        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println(e);
            //System.err.println(e);
        }
    }
}

package io;

import java.io.*;
//Simple program of writing data into the file
public class WriteByteTest {

    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\JAVA\\Desktop\\test.txt", true);
            String s = "\nHello";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();

            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {

    public static void main(String[] args) {
        try {

            //String content = "This is the content to write into file";
            //String content2 = "This is the second content to write into file";
            //if file doesnt exists, then create it
            //if (!file.exists()) {
                //file.createNewFile();
            //}
            
            
            File file = new File("C:\\Users\\JAVA\\Desktop\\test.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Hello World");
            
            bw.newLine();
            bw.write("Hello World 2");
            bw.newLine();
            bw.close();

            //System.out.println("Done");
//            }
//            else{
//                System.out.println("File exists");
//            }           

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
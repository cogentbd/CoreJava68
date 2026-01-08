package io;

import java.io.File;

public class RenameFileExample {

    public static void main(String[] args) {

        File oldfile = new File("e:\\a.txt");
        File newfile = new File("e://ab.txt");

        if (oldfile.renameTo(newfile)) {
            System.out.println("Rename succesful");
        } else {
            System.out.println("Rename failed");
        }

    }
}

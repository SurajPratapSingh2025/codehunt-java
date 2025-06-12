package com.javaIO;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("/Users/surajpratapsingh/Documents/abc.txt");
        try {
            boolean newFile = file.createNewFile();
            if (newFile) {
                System.out.println("File Created");
            } else {
                System.out.println("File Not Created (Already Exists)");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

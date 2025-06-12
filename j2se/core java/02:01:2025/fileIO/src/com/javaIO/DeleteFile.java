package com.javaIO;
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("/Users/surajpratapsingh/Documents/abc.txt");
        System.out.println(file.delete());
    }
}

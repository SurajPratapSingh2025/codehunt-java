package com.javaIO;
import java.io.File;

public class DeleteBlukFile {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++) {
        	File file = new File("/Users/surajpratapsingh/Documents/sps"+i+".txt");
            System.out.println(file.delete());
        }
    }
}

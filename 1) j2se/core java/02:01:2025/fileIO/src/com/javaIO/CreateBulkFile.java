package com.javaIO;
import java.io.File;
import java.io.IOException;

public class CreateBulkFile {
    public static void main(String[] args) {
    	for(int i=0; i<=10; i++) {
    		File file = new File("/Users/surajpratapsingh/Documents/sps"+i+".txt");
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
}

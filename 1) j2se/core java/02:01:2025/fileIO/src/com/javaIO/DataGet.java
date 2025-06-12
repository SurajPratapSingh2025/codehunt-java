package com.javaIO;
import java.io.File;
import java.io.FileInputStream;

public class DataGet {
	public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/surajpratapsingh/Documents/abc.txt");
        while(true) {
        	int i=fis.read();
        	if(i==-1)
        		break;
            System.out.print((char)i);
        	}
        fis.close();
            
        //delete
        System.out.println();
        System.out.println(new File("/Users/surajpratapsingh/Documents/abc.txt").delete());
    }
}

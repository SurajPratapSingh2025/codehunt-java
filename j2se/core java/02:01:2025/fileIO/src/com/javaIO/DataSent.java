package com.javaIO;
import java.io.FileOutputStream;

public class DataSent{
	public static void main(String[] args) throws Exception {
        String s="India is our Country";
        byte[] b=s.getBytes();
		FileOutputStream fos = new FileOutputStream("/Users/surajpratapsingh/Documents/abc.txt");
		fos.write(b);
		System.out.println("Data sent Successfully");
		fos.close();
        
    }
}

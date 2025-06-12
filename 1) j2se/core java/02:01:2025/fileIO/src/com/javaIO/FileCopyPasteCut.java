package com.javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyPasteCut {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		String source="/Users/surajpratapsingh/Downloads/JPA.jpg";
		FileInputStream fis = new FileInputStream(source);
		byte[]b=fis.readAllBytes();
		
		String desti="/Users/surajpratapsingh/Documents/JPA.jpg";
		FileOutputStream fos = new FileOutputStream(desti);
		fos.write(b);
		
		fis.close();
		fos.close();
		
		new File(source).delete();
	}
}

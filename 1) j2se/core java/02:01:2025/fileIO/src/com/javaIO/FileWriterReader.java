package com.javaIO;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReader {
	public static void main(String[] args) throws Exception {
		
		String path="/Users/surajpratapsingh/Documents/abc.txt";

		//File Writer		
//		String s="Hello File I/O";
//		FileWriter fw = new FileWriter(path);
//		fw.write(s);
//		System.out.println("Data Inserted");
//		fw.close();
		
		//File Reader
		FileReader fr = new FileReader(path);
		int temp=0;
		while(true) {
			temp=fr.read();
			if(temp==-1)
				break;
			System.out.print((char)temp);
			
		}
		fr.close();
	}
}

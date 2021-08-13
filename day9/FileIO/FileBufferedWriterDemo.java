package com.day9.FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("file.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		//bw.write(100);
		bw.write("parul");
		bw.newLine();
		 bw.write("Welcome to java");  
		bw.newLine(); // add a new line by writing a line separator.
		//char[] ch={'a','b','c','d','e','f'};
		//bw.write(ch); // write a single character.
		//bw.write(ch);
		bw.newLine();
	//	bw.newLine();
		bw.write("software");
		bw.flush(); //flushes the input stream.
		bw.close();
		
	}




}

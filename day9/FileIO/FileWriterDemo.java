package com.day9.FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("C:\\Users\\Parul Paul\\Desktop\\New folder\\abc.txt");
		
		//fw.write("hello \n");
		//fw.write(92);
		//fw.write(8);
		
		fw.write(" hi \n");
		fw.write("welcome \n");
		System.out.println("written Succesfully");
		fw.close();

	}

}


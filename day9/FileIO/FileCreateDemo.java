package com.day9.FileIO;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
		
		File file =new File("state.txt"); 
		
		System.out.println(file.exists());
		
		file.createNewFile();  //create a file
		file.mkdir(); // creating a folder
		System.out.println(file.exists());
		
	}

}

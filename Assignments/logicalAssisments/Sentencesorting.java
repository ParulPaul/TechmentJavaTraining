package logicalAssisments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sentencesorting {

	public static void main(String[] args) throws IOException {
		
		BufferedReader buffereader=new BufferedReader(new InputStreamReader(System.in));
		   
		System.out.println("Enter the sentence: ");
	    String str=buffereader.readLine();
	    
	    String words[]=str.split(" ");
	    Arrays.sort(words);
	    
	    for(int i=0;i<words.length;i++){
	    	System.out.println(words[i]);
	    }
	}

}

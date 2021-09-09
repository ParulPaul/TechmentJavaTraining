package com.collectionAssisgnments;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class State {

	public static void main(String[] args) throws IOException {


		LinkedHashSet<String> stateSet = new LinkedHashSet();
		Set<String> data = new LinkedHashSet<String>();

		FileReader fr = new FileReader("state.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {

			stateSet.add(line);
			data.add(line);
			line = br.readLine();
		}

		System.out.println("Total number of states is  :\n " + stateSet.size());

		stateSet.remove("Delhi");

		System.out.println("Name starting with k ");

		for (String b : stateSet) {
			if (b.startsWith("K"))
				System.out.println(b);
		}
		ArrayList<String> array = new ArrayList<String>(stateSet);
		Collections.sort(array);

		System.out.println(array);

		br.close();
	}


}

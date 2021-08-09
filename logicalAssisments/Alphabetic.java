package logicalAssisments;

public class Alphabetic {
	public static void main(String[] args)
    {
        int n = 4;
        
      
        String names[] = { "Parul", "Shephali", "Rashmi", "Aashi" };
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                // to compare one string with other strings
                if (names[i].compareTo(names[j]) > 0) {
                    // swapping
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        
       
        System.out.println(
            "Names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}

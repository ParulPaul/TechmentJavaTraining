package logicalAssisments;

public class SuperMarket {

	public static void main(String[] args) {
		
		int prod[] =  new int [] {22, 11, 80, 75, 5};  
		
		 int max = prod[0];  
	         
	        for (int i = 0; i < prod.length; i++) {  
	           
	           if(prod[i] > max)  
	               max = prod[i];  
	        }  
	        System.out.println("Largest element amount of product: " + max);  
	    }  

	}



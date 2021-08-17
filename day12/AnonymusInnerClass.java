package com.techment.day12.newfeature;

class Parent{
	
	void phone() {
		
		System.out.println("mi");
		
	}
}




public class AnonymusInnerClass {

	public static void main(String[] args) {
		
/**overriding * */	
		
		//Parent parent = new Parent();
		//parent.phone();

		//System.out.println("by using anonomys way");
		Parent parent2 = new Parent() {
			

			void phone() 
			{
				
				System.out.println("sumsung");
			}
	
	};
parent2.phone();
}
}
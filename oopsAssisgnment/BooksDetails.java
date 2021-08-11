package oopsAssignment;

import java.util.Scanner;
class Book{
	
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
class EngineeringBook extends Book{
	
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}


public class BooksDetails {

	public static void main(String[] args) {
		

		EngineeringBook engBook=new EngineeringBook();
		engBook.setCategory("c++");
		System.out.println("Book Cateogry : "+engBook.getCategory());
		
		engBook.setBookNo(1);
		engBook.setTitle("Basics of c++");
		engBook.setAuthor("c");
		engBook.setPrice(500);
		System.out.println("Book num : "+engBook.getBookNo());
		System.out.println("Book price : "+engBook.getPrice());
		System.out.println("Book title : "+engBook.getTitle());
		System.out.println("Book Author "+engBook.getAuthor());
		
	}

}
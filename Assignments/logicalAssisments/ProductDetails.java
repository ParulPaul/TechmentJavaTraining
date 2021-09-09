package logicalAssisments;


import java.util.ArrayList;
import java.util.Scanner;

class Products {
	
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public Products(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product Details  id= " + id + "name= " + name + "price= " + price + "quantity= " + quantity+" ";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}





public class ProductDetails {

	public static void main(String[] args) {
		
		int count=0;
		
		ArrayList<Products> prodList = new ArrayList<Products>();
		prodList.add(new Products(1,"Iphone",89000,15));
		prodList.add(new Products(2,"Oneplus",49000,20));
		prodList.add(new Products(3,"earphones",200,23));
		prodList.add(new Products(4,"earpods",3000,50));
		prodList.add(new Products(5,"charger",300,50));
		
		System.out.println(" products available");
		for(Products products :prodList)
		{
			System.out.println(products);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter product id : ");
		int numberSearch = scanner.nextInt();
		
		for(Products products :prodList)
		{	
			if(products.getId()==numberSearch)
			System.out.println(products);
			else
				count++;
		}
		
		if(count!=0) {
			System.out.println("Products not found");

		}
	}

}
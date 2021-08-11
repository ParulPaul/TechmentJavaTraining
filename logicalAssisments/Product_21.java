package logicalAssisments;

import java.util.Scanner;


class Product
{
	private int id;
	private String name;
	private float price;
	
	
	public void setId(int id)
	{ 
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getId()
	{ 
		return id;
	}
	public String getName() 
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
}

public class Product_21 {

	public static void main(String[] args) {
		
		
			int id; 
			String name;
			float product;
			boolean flag=false;
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("How many product you want to add");
			int n=scanner.nextInt();
			
			Product prod[] = new Product[n];
			
			for(int i=0;i<n;i++)
			{
				prod[i]= new Product(); 
				
				System.out.println("Enter the product id, name and price");
				id=scanner.nextInt();
				name=scanner.nextLine();
				product=scanner.nextFloat();
				
				System.out.println(id +name +product);
				prod[i].setId(id);
				prod[i].setName(name);
				prod[i].setPrice(product);
			}
			
			System.out.println("Enter the product id to get details");
			id=scanner.nextInt();
			
			for(int i=0;i<n;i++)
			{
				 flag = (id == prod[i].getId());
				if(flag == true) {
					System.out.println("Details found: \n ID: "+prod[i].getId());
					System.out.println("Name of the product: "+prod[i].getName());
					System.out.println("Price of the product: "+prod[i].getPrice());
					break;
				}
			}
	
		}

	

}

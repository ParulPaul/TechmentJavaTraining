package logicalAssisments;



public class Products {
	
	int id;
	String name;
	double price;
	
	public Products(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	class SortingArrays{
		
		public void main(String args[]) {
			
			
			Products product1 = new Products(101,"Mobile",30000.0);
			Products product2 = new Products(104,"Notebook",120.0);
			Products product3 = new Products(102,"Soap",50.0);
			Products product4 = new Products(103,"Toothpaste",100.0);
			Products product = new Products(105,"Coldrinks",80.0);
			
			
			
		}
		
	}
}

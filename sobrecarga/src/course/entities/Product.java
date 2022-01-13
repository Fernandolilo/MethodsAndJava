package course.entities;

public class Product {

	public String name;
	public Double price;
	public int quantity;
	
	public Product () {
	}
	
	public Product(String name, Double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public double TotalValueInStock() {
		return price * quantity;
	}

	public void AddProduct(int quantity) {
		this.quantity += quantity;
	}

	public void RemoveProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+", "
				+ quantity
				+ " unitis, Total: $ "
				+ String.format("%.2f", TotalValueInStock());
	}

}

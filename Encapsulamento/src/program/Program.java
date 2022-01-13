package program;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.println("Name: "  );
		String name = sc.nextLine();
		System.out.print("Price: "  );
		double price = sc.nextDouble();
		Product product = new Product(name, price);		
	
		product.setName("Computer");
		
		System.out.println();
		System.out.println("Poduct data: " + product);
		
		System.out.println();		
		System.out.println("Enter the number of products to be added in stock");
		int quantity = sc.nextInt();
		product.AddProduct(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println("Enter the number of products to be remove from stock");
		quantity = sc.nextInt();
		product.RemoveProduct(quantity);
		
		System.out.println();
		System.out.println("Remove data: " + product);
		
		sc.close();

	}

}

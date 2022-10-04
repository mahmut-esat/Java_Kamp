package week2_Constructor;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(2, "Laptop", "Asus Laptop", 20, 10, "mavi");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
	}
}

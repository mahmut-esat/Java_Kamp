package week2_Encapsulation_GetterAndSetter;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setName("Laptop");
		product.setId(10);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(5);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}
}
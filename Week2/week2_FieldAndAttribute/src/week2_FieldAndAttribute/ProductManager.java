package week2_FieldAndAttribute;

public class ProductManager{
	public void Add(Product product) {
		// JBDC
		System.out.println("Ürün Eklendi: " + product.name);
	}
}
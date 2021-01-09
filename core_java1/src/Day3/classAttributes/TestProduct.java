package Day3.classAttributes;
import Day3.Beans.*;

public class TestProduct {

	public static void main(String[] args) {
		Product product1 = new Product("Glass", 60, 6);
		Product product2 = new Product("Bottles", 20, 4);
		Product product3 = new Product("Book", 150, 5);
		
		Product[] allProducts = {product1,product2,product3};
		TestProduct arrayOfProducts = new TestProduct();
		arrayOfProducts.displayAllProducts(allProducts);
	}
	
	public void displayAllProducts(Product[] allProducts) {
		for (Product p:allProducts) {
			System.out.println(p);
		}
	}

}

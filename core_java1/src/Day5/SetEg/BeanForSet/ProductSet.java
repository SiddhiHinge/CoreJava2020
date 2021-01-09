package Day5.SetEg.BeanForSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import Day3.Beans.Product;

public class ProductSet {

	public static void main(String[] args) {
		
		Set<Product> productSet = new HashSet<Product>();
		Product p1 = new Product("Books", 30, 5);
		productSet.add(p1) ;
		Product p2 = new Product("Bag", 550, 5);
		productSet.add(p2) ;
		Product p3 = new Product("Pen", 100, 20);
		productSet.add(p3) ;
		Product p4 = new Product("Laptop", 60000, 2);
		productSet.add(p4) ;
		
		int i=0;
		
		System.out.println("Displaying ProductSet using Iterator !\n");
		Iterator<Product> itr = productSet.iterator();
		while(itr.hasNext()) {
			System.out.println("Product "+(i+1)+" : "+itr.next());
			i++;
		}
		
		System.out.println("\n--------------------------------------------------------------------\n");
		
		System.out.println("Displaying ProductSet using ForEach Loop !\n");
		for(Product p : productSet) {
			System.out.println("Product "+(i+1)+" : "+p);
		}

	}

}

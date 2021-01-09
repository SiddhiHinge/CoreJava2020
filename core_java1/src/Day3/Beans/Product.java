package Day3.Beans;

public class Product {

	private String productName;
	private int productCost;
	private int productQty;
	
	public Product() {}

	public Product(String productName, int productCost, int productQty) {
		this.productName = productName;
		this.productCost = productCost;
		this.productQty = productQty;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	@Override
	public String toString() {
		return "Product Name = " + productName + ", Product Cost = " + productCost + ", Product Qty = " + productQty;
	}
	
	
}

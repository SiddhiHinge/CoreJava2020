package BeansClass;

public class Gadget {

	int gadgetId;
	String gadgetName;
	int price;
	
	public Gadget() { }

	public Gadget(int gadgetId, String gadgetName, int price) {
		super();
		this.gadgetId = gadgetId;
		this.gadgetName = gadgetName;
		this.price = price;
	}
	
	public int getGadgetId() {
		return gadgetId;
	}

	public void setGadgetId(int gadgetId) {
		this.gadgetId = gadgetId;
	}

	public String getGadgetName() {
		return gadgetName;
	}

	public void setGadgetName(String gadgetName) {
		this.gadgetName = gadgetName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "GadgetId = " + gadgetId + ", Gadget Name = " + gadgetName + ", Price=" + price;
	}
	
}

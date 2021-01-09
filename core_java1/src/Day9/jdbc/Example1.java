package Day9.jdbc;

import BeansClass.Gadget;

public class Example1 {

	public static void main(String[] args) {
		
		Gadget g = new Gadget(121, "Airpods", 3500);
		GadgetDao dao = new GadgetDao(); 
		//dao.addGadget(g);
		//dao.viewGadget();
		//dao.deleteGadgetByName(g.getGadgetName());
		dao.updateByGadgetId(g);
		dao.viewGadget();
		//dao.getGadgetById(g.getGadgetId());
	}

}

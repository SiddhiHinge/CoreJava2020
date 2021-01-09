package Day6.HashSetPrac;

import java.util.HashSet;

public class RestaurantHashSet {

	public static void main(String[] args) {
		
		HashSet<RestaurantShruti> restaurantArray = new HashSet<RestaurantShruti>();
		
		RestaurantShruti r1 = new RestaurantShruti(51,"Siddhi Hinge",500);
		RestaurantShruti r2 = new RestaurantShruti(52,"Revati Jagtap",1500);
		RestaurantShruti r3 = new RestaurantShruti(53,"Sumedha Belur",800);
		
		restaurantArray.add(r1);
		restaurantArray.add(r2);
		restaurantArray.add(r3);
		
		for(RestaurantShruti r:restaurantArray) {
			System.out.println(r);
		}
	}

}

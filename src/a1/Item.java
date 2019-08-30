package a1;

public class Item {
	
	double price;
	int count;
	String name;
	
	
	/*Item
	 * A constructor for creating an item object
	 * 
	 * Input: an item name, count and the price
	 */
	Item(String itemName, int itemCount, double itemPrice){
		
		name = itemName;
		count = itemCount;
		price = itemPrice;
	}
	
	/* getTotalPrice
	 * Calculates and returns the total using the count and price
	 * 
	 * Output: The total using the count and price
	 */
	public double getTotalPrice() {
		
		return price * count;
		
	}

}

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
	
	/* getName
	 * return the name of the item
	 * 
	 * Output: A string of the items name
	 */
	public String getName() {
		
		return name;
		
	}
	
	/* getCount
	 * Return the number of items
	 * 
	 * Output: A integer of the number of items
	 */
	public int getCount() {
		
		return count;
	}

}

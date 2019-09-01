package a1;

import java.util.Scanner;
import java.util.HashMap;

public class Store {

	// Initialize HashMap with to store items along with the price
	
	HashMap<String, Double> items = new HashMap<>();
	
	/* fillItems
	 * 
	 * Input: A scanner object and the number of items to create in the store
	 * 
	 * Preconditions: Scanner must not be null and a number of items greater than 0
	 */ 
	public void fillItems(Scanner scanner, int numberOfItems) {
		
		// FIll the items array with the item data
		
		for(int i=0; i<numberOfItems; i++) {
			
			// Read in item data
			
			String itemName = scanner.next();
			double itemPrice = scanner.nextDouble();
			
			// Create the item in the HashMap
			
			items.put(itemName, itemPrice);
			
		}
	}
	
	/* getItemPrice
	 * Returns the item price from the items in the store
	 * 
	 * Input: A string of the item name
	 * 
	 * Output: A double of the item price. 
	 * If the item does not exist, -1.0 is returned
	 */
	public double getItemPrice(String nameOfItem) {
		
		return items.containsKey(nameOfItem) ? items.get(nameOfItem) : -1.0;
		
	}
	
	/* printCustomerData
	 * Prints the biggest customer name and cart price, smallest customer name and cart price,
	 * and the average cart price
	 * 
	 * Input: An array of customers
	 * 
	 * Preconditions: A non null list of customers
	 */
	public static void printCustomerData(Customer[] customers) {
		
	}
}

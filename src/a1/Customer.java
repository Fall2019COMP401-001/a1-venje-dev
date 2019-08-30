package a1;

import java.util.Scanner;

class Customer {
	
	String firstName;
	String lastName;
	Item[] items;
	
	
	/*Customer
	 * A constructor for creating a customer object
	 * 
	 * Input: A string for the first name, a string for the last name and the count of items
	 */
	Customer(String customerFirstName, String customerLastName, int itemCount){
		
		firstName = customerFirstName;
		lastName = customerLastName;
		
		//Initialize array based on the number of items
		
		items = new Item[itemCount];
	}
	
	/*fillCustomerItems
	 * Creates and fills an array of items
	 * 
	 * Input: A scanner object and the number of items to create
	 * 
	 * Preconditions: Scanner must not be null and number of items greater than 0
	 */
	public void fillCustomerItems(Scanner scanner, int numberOfItems) {
		
		
		// Initialize the item array using the item count
		
		items = new Item[numberOfItems];
		
		// FIll the items array with the item data
		
		for(int i=0; i<numberOfItems; i++) {
			
			// Read in item data
			
			int itemCount = scanner.nextInt();
			String itemName = scanner.next();
			double itemPrice = scanner.nextDouble();
			
			// Create the item
			
			items[i] = new Item(itemName, itemCount, itemPrice);
			
		}
		
	}
	
	/*getCustomerTotal
	 * Calculates and returns the total price of all customer items
	 * 
	 * Output: The total price of all customer items
	 */
	public String getCustomerTotal() {
		
		double totalPrice = 0.0;
		
		// Calculate the total of all items
		
		for(int i=0; i<items.length; i++) {
			
			totalPrice += items[i].getTotalPrice();
		}
		
		return String.format("%.2f", totalPrice);
	}
	
	/* getFirstName
	 * Gets the customers first name
	 */
	public String getFirstName() {
		
		return firstName;
	}
	
	/* getLastName
	 * Gets the customers last name
	 */
	public String getLastName() {
		
		return lastName;
	}

}

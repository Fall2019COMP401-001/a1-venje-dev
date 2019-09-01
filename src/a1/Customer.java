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
	
	/* fillCustomerFromShop
	 * Fills the customers item list using store pricing
	 * 
	 * Input: A store object and a scanner for reading input
	 * 
	 * Preconditions: The store must not be null
	 */
	public void fillCustomerFromShop(Store store, Scanner scanner) {
		
		for(int i=0; i<items.length; i++) {
			
			int numberOfItem = scanner.nextInt();
			String nameOfItem = scanner.next();
			
			// Add item to customer item list using the price from the store
			items[i] = new Item(nameOfItem, numberOfItem, store.getItemPrice(nameOfItem));
			
		}
		
	}
	
	/*getCustomerTotal
	 * Calculates and returns the total price of all customer items
	 * 
	 * Output: The formated total price of all customer items
	 */
	public String getCustomerTotal() {
		
		double totalPrice = getRawTotalPrice();
		
		return String.format("%.2f", totalPrice);
	}
	
	/* getRawTotalPrice
	 * Returns the raw double of the total price
	 * 
	 * Output: The unformatted double of the total price
	 */
	public double getRawTotalPrice() {
		
		double totalPrice = 0.0;
		
		// Calculate the total of all items
		
		for(int i=0; i<items.length; i++) {
			
			totalPrice += items[i].getTotalPrice();
		}
		
		return totalPrice;
		
	}
	
	/* getFirstName
	 * Gets the customers first name
	 * 
	 * Output: A string of the customer first name
	 */
	public String getFirstName() {
		
		return firstName;
	}
	
	/* getLastName
	 * Gets the customers last name
	 * 
	 * Output: A string of the customer last name
	 */
	public String getLastName() {
		
		return lastName;
	}
	

	/* amountPurchased
	 * Returns the amount of a particular item purchased
	 * 
	 * Input: A string of the item name
	 * 
	 * Output: An integer of the number of purchased item
	 * 
	 */
	public int amountPurchased(String itemName) {
		
		int totalPurchased = 0;
		
		for( int i=0; i< items.length; i++) {
			
			if(items[i].getName().equalsIgnoreCase(itemName)) {
				
				totalPurchased = items[i].getCount();
				break;
			}
		}
		
		return totalPurchased;
	}

}

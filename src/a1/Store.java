package a1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Store {

	// Initialize HashMap with to store items along with the price
	
	HashMap<String, Double> items = new HashMap<>();
	
	//List of customers using the store
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
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
	public void printCustomerData() {
		
		Customer highestCustomer = customers.get(0);
		Customer lowestCustomer = customers.get(0);
		double customerTotal = Double.parseDouble(customers.get(0).getCustomerTotal());
		
		//Get the customer with the highest and lowest item list
		for(int i=1; i<customers.size(); i++ ) {
			
			customerTotal +=  Double.parseDouble(customers.get(i).getCustomerTotal());
			
			if( Double.parseDouble(customers.get(i).getCustomerTotal()) > 
				Double.parseDouble(highestCustomer.getCustomerTotal())) {
				
				highestCustomer = customers.get(i);
				
			}else if(Double.parseDouble(customers.get(i).getCustomerTotal()) < 
					 Double.parseDouble(lowestCustomer.getCustomerTotal())) {
				
				lowestCustomer = customers.get(i);
				
			}
		}
		
		//Output the data
		
		System.out.println("Biggest: " + highestCustomer.getFirstName() + " " + highestCustomer.getLastName() + 
						   " (" + highestCustomer.getCustomerTotal() + ")");
		
		System.out.println("Smallest: " + lowestCustomer.getFirstName() + " " + lowestCustomer.getLastName() + 
				   " (" + lowestCustomer.getCustomerTotal() + ")");
		
		System.out.println("Average: " + String.format("%.2f", customerTotal/customers.size()));
	}
	
	/* addCustomer
	 * Add a customer to the list of customers using the store
	 * 
	 * Input: A customer object and a scanner for adding items
	 * 
	 * Preconditions: A non null scanner object
	 */
	public void addCustomer(Customer customer, Scanner scanner) {
		
		//Add the customer to the list and fill their item list
		
		customers.add(customer);
		customer.fillCustomerFromShop(this, scanner);
	}
}

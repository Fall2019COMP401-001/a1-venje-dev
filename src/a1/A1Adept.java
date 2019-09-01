package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Read in the number of store items
		
		int totalStoreItems = scan.nextInt();
		
		// Create a new store to hold items
		
		Store store = new Store();
		
		// Fill the store items
		
		store.fillItems(scan, totalStoreItems);
		
		// Read in the total number of customers and create a list
		
		int totalCustomers = scan.nextInt();
		
		// Create the customers and fill their item list
		
		for(int i=0; i<totalCustomers; i++) {
			
			String firstName = scan.next();
			String lastName = scan.next();
			int numberOfItems = scan.nextInt();
			
			//Create and add customer to the store
			
			Customer customer = new Customer(firstName, lastName, numberOfItems);
			store.addCustomer(customer, scan);
			
		}
		
		//Output the customer data
		
		store.printCustomerData();
		
	}
}

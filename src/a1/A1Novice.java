package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Read in the number of customers
		
		int totalCustomers = scan.nextInt();
		
		// Create an array to store customers
		
		Customer customers[] = new Customer[totalCustomers];
		
		// Read customer data into the customer array
		
		for (int i=0; i<totalCustomers; i++) {
			
			String firstName = scan.next();
			String lastName = scan.next();
			int itemCount = scan.nextInt();
			
			// Create a new customer using the data
			
			customers[i] = new Customer(firstName, lastName, itemCount);
			
			// Fill the customer with the items
			
			customers[i].fillCustomerItems(scan, itemCount);
			
		}
		
		// All input parsed
		
		scan.close();
					
		// Print the customers with data
					
		for(int i=0; i<totalCustomers; i++) {
						
			System.out.println(customers[i].getFirstName().charAt(0) + ". " + 
							   customers[i].getLastName() + ": " +
							   customers[i].getCustomerTotal());
			
		}
		
	}
}

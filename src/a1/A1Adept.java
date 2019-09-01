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
		
		// Read in the total number of customers
		
		int totalCustomers = scan.nextInt();
		
		
		
	}
}

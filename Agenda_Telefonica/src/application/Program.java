package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<ArrayList<String>> phoneList = new ArrayList<>();
		
		char answer = 'y';
		
		while (answer == 'y' ) {
			System.out.println("===== PHONE BOOK =====");
			System.out.println("1 - Add a new contact");
			System.out.println("2 - Search number by contact name");
			System.out.println("3 - Contacts list");
			System.out.println("4 - Remove contact");
			System.out.println("5 - Exit");
			System.out.print("Please, select an option: ");
			int option = sc.nextInt();
			sc.nextLine();
			
			
			switch (option) {
			case 1:
				ArrayList<String> contact = new ArrayList<>();
				System.out.println("=== CREATE CONTACT ===");
				System.out.print("Please, enter the contact name: ");
				String name = sc.nextLine();
				contact.add(name);
				System.out.print("Please, enter the phone number: ");
				String phoneNumber = sc.nextLine();
				contact.add(phoneNumber);
				phoneList.add(contact);
				break;
			case 2:
				System.out.println("=== CONTACT SEARCHING ===");
				System.out.print("Please, enter the contact name you want to search: ");
				name = sc.nextLine();
				for (int i=0; i<phoneList.size(); i++) {
					if (phoneList.get(i).get(0).contains(name)) {
						System.out.println(phoneList.get(i));
						break;
					} else if (i == (phoneList.size() - 1)) {
						System.out.println("Contact doesn't exist!");
					}
				}
				break;
			case 3:
				System.out.println("=== CONTACT LIST ===");
				for (int i=0; i<phoneList.size(); i++) {
					System.out.println("#" + (i + 1) + ": " + phoneList.get(i));
				}
				break;
			case 4:
				System.out.println("=== CONTACT EXCLUSION ===");
				System.out.println("Please, select the contact index you want to Delete");
				for (int i=0; i<phoneList.size(); i++) {
					System.out.println("#" + (i + 1) + ": " + phoneList.get(i));					
				}
				int delete = sc.nextInt();
				sc.nextLine();
				System.out.println("The contact " + phoneList.get(delete - 1) + " was deleted successfully");
				phoneList.remove(delete - 1);
				break;
			case 5:
				return;
			}
			
			
			
		}
		
		sc.close();	
	}
}

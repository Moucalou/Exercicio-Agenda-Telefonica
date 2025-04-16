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
				System.out.print("Please, enter the contact name: ");
				String name = sc.nextLine();
				contact.add(name);
				System.out.print("Please, enter the phone number: ");
				String phoneNumber = sc.nextLine();
				contact.add(phoneNumber);
				phoneList.add(contact);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
			
			
			
		}
		
		sc.close();	
	}
}

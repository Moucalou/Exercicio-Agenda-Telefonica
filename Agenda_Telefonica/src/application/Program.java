package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] list = new String[0][2];
		
		char answer = 'y';
		
		while (answer == 'y' ) {
			System.out.println("===== PHONE BOOK =====");
			System.out.println("1 - Add a new contact");
			System.out.println("2 - Search number by contact name");
			System.out.println("3 - Contacts list");
			System.out.println("4 - Remove contact");
			System.out.print("Please, select an option: ");
			int option = sc.nextInt();
			sc.nextLine();
		}
		
		sc.close();	
	}
}

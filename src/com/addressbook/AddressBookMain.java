package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
         AddressBook addressBook = new AddressBook();
		AddressBookList addressBookList = new AddressBookList();
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Addressbook");
		int option = 0;
		while (option != 11) {
		System.out.println("Enter 1 to open existing addressbook");
		System.out.println("Enter 2 to open new addressbook");
		System.out.println("Enter 3 to search persons in a city");
		System.out.println("Enter 4 to search persons in a state");
		System.out.println("Enter 5 to count persons in a state");
		System.out.println("Enter 6 to count persons in a city");
		System.out.println("Enter 7 to sort persons by city");
		System.out.println("Enter 8 to sort persons by state");
		System.out.println("Enter 9 to sort persons by zip");
		System.out.println("Enter 10 to see all addressbooks");
		System.out.println("Enter 11 to exit");
	    option = in.nextInt();
			if (option == 1)
				addressBookList.openAddressBook();
			else if (option == 2)
				addressBookList.newAddressBook();
			else if(option == 3) {
				System.out.println("Enter City");
				String city = in.next();
				System.out.println(addressBook.searchPersonsByCity(city));
			}
			else if(option == 4) {
				System.out.println("Enter State");
				String state = in.next();
				System.out.println(addressBook.searchPersonsByState(state));
			}
			else if(option == 5) {
				System.out.println("Enter State");
				String state = in.next();
				System.out.println(addressBook.countPersonsByState(state));
			}
			else if(option == 6) {
				System.out.println("Enter City");
				String city = in.next();
				System.out.println(addressBook.countPersonsByCity(city));
			}
			else if(option == 7) {
				System.out.println(addressBook.sortPersonsByCity());
			}
			else if(option == 8) {
				System.out.println(addressBook.sortPersonsByState());
			}
			else if(option == 9) {
				System.out.println(addressBook.sortPersonsByZip());
			}
			else if(option == 10) {
				((AddressBookList) addressBookList).showAllDetails();
			}
			else if (option == 11)
				break;
			else
				System.out.println("Enter Correct option");
		}
		in.close();
		System.out.println("Thank You");
	}
}
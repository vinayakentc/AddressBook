package com.addressbook;

import java.util.*;
import com.addressbook.Contacts;

public class AddressBook {

	Scanner in = new Scanner(System.in);
	private ArrayList<Contacts> contactList = new ArrayList<>();
	Map<String, Contacts> contactMap = new HashMap<>();
	static Map<String, AddressBook> addressBookList = new TreeMap<>();
	
	public void addNewContact() {
		boolean b = false;
		Contacts person = new Contacts();
		System.out.print("First Name: ");
		while(!b) {
		b = person.setFirstName(in.next());
		}
		b = false;
		System.out.print("Last Name: ");
		while(!b) {
		b = person.setLastName(in.next());
		}
		b = false;
		System.out.print("Address: ");
		while(!b) {
		b = person.setAddress(in.next());
		}
		b = false;
		System.out.print("City: ");
		while(!b) {
		b = person.setCity(in.next());
		}
		b = false;
		System.out.print("State: ");
		while(!b) {
		b = person.setState(in.next());
		}
		b = false;
		System.out.print("Zip: ");
		while(!b) {
		b = person.setZip(in.next());
		}
		b = false;
		System.out.print("Phone Number: ");
		while(!b) {
		b = person.setPhoneNo(in.next());
		}
		b = false;
		System.out.print("Email: ");
		while(!b) {
		b = person.setEmail(in.next());
		}
		String name = person.getFirstName()+" "+person.getLastName();
		Boolean keyPresent = contactMap.containsKey(name);
		if (keyPresent) {
			System.out.println("This name is already present\n");
		}else {
			contactList.add(person);
		contactMap.put(name, person);
		}
	}
	
	public void editContact(String firstName, String lastName) {
		String name = firstName+" "+lastName;
		boolean b = false;
		Boolean keyPresent = contactMap.containsKey(name);
		if (keyPresent) {
			System.out.println("What do you want to update?");
			String s = in.next().toLowerCase();
			switch (s) {
			case ("address"):
				System.out.println("Enter address");
			while(!b) {
				b = contactMap.get(name).setAddress(in.next());
			}
				break;
			case ("city"):
				System.out.println("Enter city");
			while(!b) {
				b = contactMap.get(name).setCity(in.next());
			}
				break;
			case ("state"):
				System.out.println("Enter state");
			while(!b) {
				b = contactMap.get(name).setState(in.next());
			}
				break;
			case ("zip"):
				System.out.println("Enter zip");
			while(!b) {
				b = contactMap.get(name).setZip(in.next());
			}
				break;
			case ("phoneno"):
				System.out.println("Enter phone no");
			while(!b) {
				b = contactMap.get(name).setPhoneNo(in.next());
			}
				break;
			case ("email"):
				System.out.println("Enter email");
			while(!b) {
				b = contactMap.get(name).setEmail(in.next());
			}
				break;
			}
		} else {
			System.out.println("This name is not present in the address book.");
		}
	
		
	}

	public void showDetails() {
		if (contactList.size() == 0)
			System.out.println("No contacts to show");
			for (int i = 0; i < contactList.size(); i++) {
				Contacts person = contactList.get(i);
				System.out.println("\nContact :" + (i + 1));
				System.out.println(person);
			}
		
	}
}

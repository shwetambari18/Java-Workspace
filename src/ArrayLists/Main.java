package ArrayLists;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	public ArrayList<Contacts>  contactList = new ArrayList<Contacts>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MobilePhone phone = new MobilePhone();
		Contacts contact;
		boolean flag=true;
		while(true)
		{
			printInstructions();
			System.out.println("Please enter your choice:");
			switch(scanner.nextInt())
			{
				case 0: 
					flag = false;
					break;
				case 1:
					contact = getContact(); 		
					phone.addItem(contact);
					break;
				case 2:
					System.out.println("Modify contact with name:");
					String name = scanner.next();
					contact = getContact(); 	
					
					phone.modifyItem(name, contact);
					break;
				case 3:
					System.out.println("Delete contact with name:");
					String name1 = scanner.next();
					phone.removeItem(name1);
					break;
				case 4:
					System.out.println("Find contact with name:");
					String name2 = scanner.next();
					phone.findContact(name2);
					break;
				case 5:
					System.out.println("Display contact list with name and number:");
					phone.displayContactList();
					break;
					
			}
		}

	}
	
	public static Contacts getContact()
	{
		System.out.println("Please enter Name");
		Contacts contact = new Contacts();
		contact.setName(scanner.next());
		System.out.println("Please enter Number");
		contact.setPhoneNumber(scanner.nextInt());
		
		return contact;
	}
	public static void printInstructions()
	{
		System.out.println("0 Quit");
		System.out.println("1 Add Contact");
		System.out.println("2 Modify Contact");
		System.out.println("3 Delete Contact");
		System.out.println("4 Find Contact");
		System.out.println("5 Display List of Contact");
	}

}

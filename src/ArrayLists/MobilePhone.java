package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	
	public static Scanner scanner = new Scanner(System.in);
	public ArrayList<Contacts>  contactList = new ArrayList<Contacts>();
	
	public void addItem(Contacts contact)
	{
		contactList.add(contact);
		System.out.println("Item added!");
	}

	public void modifyItem(String name,Contacts contact)
	{
		
		int pos = findItem(name);
		if(pos >= 0 )
		{
			contactList.set(pos, contact);
		}
		else
		{
			System.out.println("Item not found");
		}
	}
	
	public void removeItem(String  name)
	{
		int pos = findItem(name);
		if(pos >=0 )
		{
			contactList.remove(pos);
			System.out.println("Item deleted!");
		}
		else
		{
			System.out.println("Item Not Found");
		}
	}
	
	public int findItem(String name)
	{
		//int pos = contactList.indexOf(name);
		
		int pos=-1;
		for(Contacts contact : contactList)
		{
			if(contact.getName().equals(name))
			{
				pos = contactList.indexOf(contact);
			}
		}
		return pos;
	}
	
	public Contacts findContact(String name)
	{
		int pos = findItem(name);
		
		if(pos >= 0)
			System.out.println("Name: " + contactList.get(pos).getName()+ " Phone number : " + contactList.get(pos).getPhoneNumber());
		else
			System.out.println("Item not found");
		
		return null;
	}
	
	public void displayContactList()
	{
		for(Contacts contact : contactList)
		{
			System.out.println("Name : " + contact.getName() + " PHONE Number : " + contact.getPhoneNumber());
		}
	}
}

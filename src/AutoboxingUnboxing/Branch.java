package AutoboxingUnboxing;

import java.util.ArrayList;


public class Branch {

	private String branchName;
	private ArrayList<Customer> customers;// = new ArrayList<Customer>();
	
	public Branch(String branchName) {
		super();
		this.branchName = branchName;
		this.customers = new ArrayList<Customer>();
	}
	public String getBranchName() {
		return branchName;
	}
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
	public void addNewCustomer(String name)
	{
		Customer customer = new Customer(name);
		if(findCustomer(name) < 0)
		{
			getCustomers().add(customer);
			System.out.println("Customer : " + name+ " added succesfully to branch with name : " + this.branchName);
		}
		else
		{
			System.out.println("Customer already exists with same name!");
		}
		
	}
	
	public void makeTransactions(String name,double amount)
	{
		int pos = findCustomer(name);
		if(pos >= 0)
		{
			Customer customer = customers.get(pos);
			customer.getTransactions().add(amount);
		}
		else
		{
			System.out.println("Customer don't exists!");
		}
	}
	public int findCustomer(String name)
	{
		int pos=-1;
		for(Customer cust : customers)
		{
			if(cust.getName().equals(name))
			{
				pos= customers.indexOf(cust);
			}
		}
		return pos;
	}
	
	
	
	
}

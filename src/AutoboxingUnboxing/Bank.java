package AutoboxingUnboxing;

import java.util.ArrayList;

public class Bank {

	private ArrayList<Branch> branches = new ArrayList<Branch>();

	public Bank() {
		super();
		//this.branches = branches;
	}

	public ArrayList<Branch> getBranches() {
		return branches;
	}
	
	public void addNewBranch(String name)
	{
		Branch branch = new Branch(name);
		if(findBranch(name) < 0)
		{
			branches.add(branch);
			System.out.println(name + " branch added sucessfully!");
		}
		else
		{
			System.out.println("Branch already exists!");
		}
	}
	
	public void addCustomerInBranch(String branchName,String custName)
	{
		int branchPos = findBranch(branchName);
		Branch branch = branches.get(branchPos);
		int custPos = branch.findCustomer(custName);
		if(custPos < 0)
		{
			branch.addNewCustomer(custName);
		}
		else
		{
			System.out.println("Customer already exists in branch");
		}
	}
	
	public void makeAdditionalTransactions(String custName,double amount,String branchName)
	{
		int branchPos = findBranch(branchName);
		if(branchPos < 0)
		{
			System.out.println("Branch not found!");
			return;
		}
		Branch branch = branches.get(branchPos);
		int custPos = branch.findCustomer(custName);
		if(custPos >= 0)
		{
			branch.makeTransactions(custName, amount);
		}
		else
		{
			System.out.println("Customer not exists in branch");
		}
	}
	
	public int findCustomer(ArrayList<Customer> customers,String custName)
	{
		int custPos = -1;
		
		for(Customer cust : customers)
		{
			if(cust.getName().equals(custName))
			{
				custPos = customers.indexOf(cust);
			}
		}
		return custPos;
	}
	public int findBranch(String name)
	{
		int pos = -1;
		for(Branch branch : branches)
		{
			if(branch.getBranchName().equals(name))
			{
				pos = branches.indexOf(branch);
			}
		}
		return pos;
	}
	
	public void displayCustomersInBranch(String branchName)
	{
		int branchPos = findBranch(branchName);
		if(branchPos < 0)
		{
			System.out.println("Branch not found!");
			return;
		}
			
		Branch branch = branches.get(branchPos);
		int tranNum=0;
		
		for(Customer cust:branch.getCustomers())
		{
			tranNum=1;
			System.out.println("Customer Name: " + cust.getName());
			for(double transaction :  cust.getTransactions())
			{
				System.out.println("Transaction no " + tranNum+ "is: " + transaction);
				tranNum++;
			}
		}
	}
}

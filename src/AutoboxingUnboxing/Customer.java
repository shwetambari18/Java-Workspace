package AutoboxingUnboxing;

import java.util.ArrayList;

public class Customer {

	private String name;
	private ArrayList<Double> transactions;//=new ArrayList<Double>();
	public Customer(String name) {
		super();
		this.name = name;
		this.transactions = new ArrayList<Double>();
		this.transactions.add(120.00);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	public void setTransactions(ArrayList<Double> transactions) {
		this.transactions = transactions;
	}
	
	public Customer createCustomer(String name,double amount)
	{
		transactions.add(amount);
		Customer customer = new Customer(name);
		return customer;
	}
}

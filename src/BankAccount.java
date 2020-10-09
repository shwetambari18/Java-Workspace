
public class BankAccount {

	
	public static void main(String args[])
	{
		BankAccount account = new BankAccount();
		account.deposite(1000);
		account.deposite(1000);
		account.withdraw(2000);
		//account.withdraw(2000);
		
	}
	
	private int accountNumber;
	private int balance;
	private String customerName;
	private int phoneNo;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void deposite(int fund)
	{
		this.balance += fund;
		System.out.println("Balance after deposite: " + this.balance);
	}
	
	public void withdraw(int fund)
	{
		if(fund <= this.balance)
			this.balance -= fund;
		else
			System.out.println("You have only balance : " + this.balance);
		
		System.out.println("Balance after withdrwal: " + this.balance);
	}
	
	
}

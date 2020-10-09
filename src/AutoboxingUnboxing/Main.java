package AutoboxingUnboxing;

import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean exit=false;
		int choice;
		Bank bank = new Bank();
		while(!exit)
		{
			printBanking();
			System.out.println("Please enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice)
			{
				case 0:
					exit = true;
					break;
				case 1:
					System.out.println("Enter branch name");
					String name = scanner.next();
					bank.addNewBranch(name);
					break;
				case 2:
					System.out.println("Enter customer name to add: ");
					String custName = scanner.next();
					System.out.println("Enter branch name to add in: ");
					String branchName = scanner.next();
					
					bank.addCustomerInBranch(branchName, custName);
					break;
				case 3:
					System.out.println("Enter customer name to add: ");
					String custName1 = scanner.next();
					System.out.println("Enter branch name to add transactions: ");
					String branchName1 = scanner.next();
					System.out.println("Enter Amount to add: ");
					double amount = scanner.nextDouble();	
					bank.makeAdditionalTransactions(custName1, amount, branchName1);
					
					break;
				case 4:
					System.out.println("Enter branch name to show list: ");
					String branchName2 = scanner.next();
					
					bank.displayCustomersInBranch(branchName2);
					break;
					
			}
		}
	}
	
	public static void printBanking()
	{
		System.out.println("0 Quit");
		System.out.println("1 Add new branch to bank");
		System.out.println("2 Add new customer in branch");
		System.out.println("3 Add additional transaction");
		System.out.println("4 Show list of customers for Branch");
	}

}

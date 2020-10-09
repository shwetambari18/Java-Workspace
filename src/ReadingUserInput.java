import java.util.Scanner;


public class ReadingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scanner.next();
		System.out.println("Please enter your year of birth : ");
		if(scanner.hasNextInt())
		{
			int year = scanner.nextInt();
			
			int age = 2020-year;
			System.out.println(" "+name + " Your age is : "+age);
		}
			
		scanner.close();*/
		
		
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		int num=0;
		while(count <=10)
		{
			System.out.println("Please enter " +count+"  number: ");
			if(scanner.hasNextInt())
			{
				num += scanner.nextInt();
				
				count++;
			}
			else
			{
				System.out.println("Please enter valid int!");
				//scanner.nextLine();
			}
			scanner.nextLine();
		}
		
		System.out.println("Addition of 10 numbers is :" + num);
		
		scanner.close();

	}

}

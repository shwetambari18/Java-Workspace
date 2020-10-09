import java.util.Scanner;


public class InputCalculator {

	public static void inputThenPrintSumAndAverage()
	{
		Scanner scanner = new Scanner(System.in);
		int num=0;
		int sum=0;
		long avg=0;
		int count=0;
		while(true)
		{
			if(scanner.hasNextInt())
			{
				num = scanner.nextInt();
				sum += num;
				count++;
				avg= Math.round((double)(sum/count));
				
			}
			else
			{
				System.out.println("SUM = " + sum + " AVG = "+avg);
				break;
			}
			scanner.nextLine();
		}
		
		scanner.close();
	}
}

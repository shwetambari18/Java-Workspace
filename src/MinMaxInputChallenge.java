import java.util.Scanner;


public class MinMaxInputChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int min=Integer.MAX_VALUE;//2147483647;
			int max =Integer.MIN_VALUE;//-2147483648;
		int num=0;
		boolean first = true;
		while(true)
		{
			System.out.println("Please enter numbers: ");
			if(scanner.hasNextInt())
			{
				num= scanner.nextInt();
				if(first)
				{
					first = false;
					min= num;
					max= num;
				}
				if(min > num)
				{
					min = num;
				}
				if(max < num)
				{
					max = num;
				}
			}
			else
			{
				System.out.println("Min is " + min + " Max is " + max);
				break;
			}
			scanner.nextLine();
		}
		

	}

}

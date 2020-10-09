package Arrays;

import java.util.Scanner;

public class MinElementChallenge {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = readIntegers(5);
		int min= findMin(arr);
		System.out.println("Minimum is : "+ min);

	}
	
	public static int[] readIntegers(int capacity)
	{
		int[] arr = new int[capacity];
		System.out.println("Please enter "+capacity+" numbers: ");
		for(int i=0;i<capacity;i++)
		{
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	public static int findMin(int[] arr)
	{
		int min=Integer.MAX_VALUE;
		//boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
//			if(flag)
//			{
//				min=arr[i];
//				flag=false;
//				
//			}
			if(min > arr[i])
			{
				min=arr[i];
			}
			
		}
		return min;
	}

}

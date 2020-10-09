package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int[] arr = getIntegers(5);
		printArray(arr);
		printArray(arr);
		printArray(sortArray(arr));
		scanner.close();
	}
	
	public static int[] getIntegers(int capacity)
	{
		int[] numbers = new int[capacity];
		System.out.println("Enter  numbers: ");
		for(int i=0;i<5;i++)
		{
			numbers[i] = scanner.nextInt();
		}
		return numbers;
	}
	
	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Number in array at pos"+ i+" is:" + array[i]);
		}
	}
	
	public static int[] sortArray(int[] array)
	{
		int a;
		int[] sortedArray = Arrays.copyOf(array, array.length);//array;
		for(int i=0;i<sortedArray.length;i++)
		{
			for(int j=i+1;j<sortedArray.length;j++)
			{
				if(sortedArray[i] > sortedArray[j] )
				{
					a = sortedArray[j];
					sortedArray[j]=sortedArray[i];
					sortedArray[i] = a;
					
				}
			}
		}
		
		return sortedArray;
	}
}

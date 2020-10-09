package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= readIntegers(5);
		int[] reversedArr = reverseArray(arr);
		System.out.println("Reverse array : " + Arrays.toString(reversedArr));
	}
	
	public static int[] reverseArray(int[] arr)
	{
		int[] reversedArr = new int[arr.length];
		for(int i=arr.length-1,j=0;i>=0;i--,j++)
		{
			reversedArr[j] = arr[i];
		}
		return reversedArr;
	}

	public static int[] readIntegers(int capacity)
	{
		int[] arr = new int[capacity];
		for(int i=0;i<capacity;i++)
		{
			System.out.println("Please enter number : ");
			arr[i] = scanner.nextInt();
			scanner.nextLine();
		}
		return arr;
	}
}

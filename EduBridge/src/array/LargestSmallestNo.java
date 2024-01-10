package array;

import java.util.Scanner;

public class LargestSmallestNo 
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size=s.nextInt();

		int array[]=new int[size];

		System.out.println("\nEnter Data: ");
		for(int i=0; i<size; i++)
		{
			array[i]=s.nextInt();
		}
		
		int max=array[0];
		int min=array[0];
		for(int i=1; i<size; i++)
		{
			if(max<array[i])
			{
				max=array[i];
			}
			else if (min>array[i])
			{
				min=array[i];
			}
		}
		System.out.println("\n Largest number is: "+ max);
		System.out.println("\n Smallest number is: "+ min);
	}

}

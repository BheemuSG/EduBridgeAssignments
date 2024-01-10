package array;

import java.util.Scanner;

public class ArrayExamples 
{

	public static void main(String[] args) 
	{
		System.out.println("--------Way1------------");
		int a[]= {10, 20, 30, 40, 50};
		String b[]= {"C", "C#", "C++", "Java", "Python"};
		
		System.out.println("--------Way2------------");
		
		Scanner s= new Scanner(System.in);
		
		int c[]= new int[5];
		System.out.println("Enter Data: ");
		
		for (int i=0; i<=4; i++)
		{
			c[i]=s.nextInt();
		}
		
		System.out.println("Display data in Sque: ");
		for (int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
		System.out.println("Display data in reverse: ");
		for (int i=c.length-1; i>=0; i--)
		{
			System.out.println(c[i]);
		}
		

	}

}

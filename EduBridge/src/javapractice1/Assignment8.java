package javapractice1;

import java.util.Scanner;

public class Assignment8 
{

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		
		String names[]= {"Bheemu", "Rekha","Siddu", "bheemu", "Yogesh"};
		System.out.println("Enter the name which need to check: ");
		String name = reader.nextLine();
		reader.close();
		
		int found =0;
		
		for (int i=0; i<names.length; i++)
		{
			if(name.equalsIgnoreCase(names[i]))
				found++;
		}
		if(found>0)
			System.out.println("Congrats!, Your name in the array " + found + " times");	
		else
			System.out.println("Your name not present in array");
				
	}

}

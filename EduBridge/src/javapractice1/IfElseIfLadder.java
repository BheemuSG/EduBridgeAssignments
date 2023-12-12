package javapractice1;

import java.util.Scanner;

public class IfElseIfLadder 
{
	static String name;
	
	void ifElseIf()
	{
		if(name.equals("Rohit"))
		{
			System.out.println("Rohit age is 36 years");
		}
		else if(name.equals("Virat"))
		{
			System.out.println("Virat age is 35 years");
		}
		else if (name.equals("M.S.Dhoni"))
		{
			System.out.println("M.S.Dhoni age is 42 years");
		}
		else
		{
			System.out.println("We do not have that data");
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name of the Cricketer");
		name=sc.nextLine();
		
		
	}

}

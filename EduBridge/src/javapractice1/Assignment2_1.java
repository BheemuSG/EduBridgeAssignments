package javapractice1;
import java.util.Scanner;
public class Assignment2_1 
{

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the age: ");
        int age = reader.nextInt();
		
		if(age>=18)
			System.out.println("You are elegible for vote");
		else
			System.out.println("You are not elegible for vote");
	}

}

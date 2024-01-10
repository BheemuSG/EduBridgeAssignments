package BankTransaction;
import java.util.Scanner;

public class Project 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		int passwd, amount;
		String accName, transaction;

		System.out.println("Enter your User Name: ");
		accName = reader.nextLine();
		reader.reset();
		System.out.println("Enter your Password: ");
		passwd = reader.nextInt();
		reader.nextLine();
		System.out.println("Enter your mode of transaction: ");
		transaction = reader.nextLine();
		System.out.println("Enter your the amount: ");
		amount = reader.nextInt();

		user us = new user();
		transactionMode tm=new transactionMode();

		boolean result = us.userValidation(accName, passwd, transaction, amount);

		if (result == true) 
		{
			tm.mode(transaction, amount);
		}
		else
			System.out.println("Invalid user name and password");
	}
}
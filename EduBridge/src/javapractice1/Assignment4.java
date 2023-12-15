package javapractice1;
import java.util.Scanner;

class student
{
	String sName;
	int sID, sRolNo, totalMarks, average;

	void read()
	{
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the Student Name: ");
		sName = reader.nextLine();
		System.out.println("Enter the Student ID Number: ");
		sID = reader.nextInt();
		System.out.println("Enter the Student Roll Number: ");
		sRolNo = reader.nextInt();
		System.out.println("Enter the Student 6 subject total Marks: ");
		totalMarks = reader.nextInt();		
	}

	void showval()
	{
		System.out.println("Student Name is: " + sName);
		System.out.println("Student ID number is: " + sID);
		System.out.println("Student Roll number is: " + sRolNo);
		System.out.println("Student Total Marks of 6 Subject is: " + totalMarks);
		System.out.println("Average Marks of the 6 Subject is: " + totalMarks/6);
	}

}

public class Assignment4 
{
		public static void main(String[] args)
		{
			student stu= new student();
			stu.read();
			stu.showval();
		}
	
}

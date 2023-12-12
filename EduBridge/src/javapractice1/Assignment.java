package javapractice1;
import java.util.Scanner;

public class Assignment {
	
	
	static String studentName;
    static float studentMarks;
    
	public static void main(String[] args) 
	{
		
		 // Integer data types
        int integerValue = 10;
        short shortValue = 20;
        long longValue = 30L;

        // Floating-point data types
        float floatValue = 3.14f;
        double doubleValue = 2.71828;

        char charValue = 'A'; // Character data type

        boolean booleanValue = true;  // Boolean data type

        // Displaying values
        System.out.println("Integer Value: " + integerValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student name: ");
        studentName = scanner.next();
        System.out.println("Enter the Total marks of six subject: ");
        studentMarks=scanner.nextShort();
        Assignment per= new Assignment();
        per.calpercentage();
	}
	void calpercentage() 
	{
		float percentage=(studentMarks/600)*100;
		System.out.println("Percentaage is "+ percentage);
	}
}


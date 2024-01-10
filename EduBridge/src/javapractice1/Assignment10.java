package javapractice1;

public class Assignment10 
{

	public static void main(String[] args) 
	{
		//Print the length 
		
		String myName="Bheemanagowda";
		int i=0;
		char ch;
		String reverseString="";
		
		for (char c:myName.toCharArray())	//toCharArray will convert from string to char array
			i++;
		System.out.println("Length of the myName string :: " + i);
		
		//Print String in reverse
		
		for (int j=0; j<myName.length(); j++)
	      {
	        ch= myName.charAt(j); 
	        
	        reverseString = ch+reverseString;
	      }
		System.out.println("Reversed word: "+ reverseString);
		
		//Print a single char
		
		System.out.println("Single Char : "+ myName.charAt(7));
		
		//Print 3 char of string
		
		int a=0;
		for (int k=0; k<3; k++)
		{
			
		}
		
		
	}

}

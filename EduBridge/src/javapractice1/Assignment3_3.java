package javapractice1;

public class Assignment3_3 
{

	public static void main(String[] args) 
	{
		for (int i=0; i<=5; i++)
		{
			for (int j = 1; j <= 5-i; j++) 
			{
                System.out.print(j + " ");
            }
            System.out.println();
		}
	}

}
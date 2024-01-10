package javapractice1;

class human
{
	void eat()
	{
		System.out.println("Eat a balanced diet with lots of fruits and vegetables.");
	}
	void work()
	{
		System.out.println("Try to be physically active for 30 minutes most days of the week.");
	}
	void sleep()
	{
		System.out.println("Make sleep a priority.");
	}
}

class bheema extends human
{
	bheema()
	{
		eat();
		work();
		sleep();
		read();
		speech();
	}
	void read()
	{
		System.out.println("Reading books can have many benefits.");
	}
	void speech()
	{
		System.out.println("Speech is the human vocal form of communication.");
	}
}

public class Assignment11 
{

	public static void main(String[] args) 
	{
		bheema b=new bheema();
	}

}

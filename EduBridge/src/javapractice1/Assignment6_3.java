package javapractice1;

class MyDate1
{
	private int dd, mm, yy;
	static void show()
	{
		System.out.println("Reached here");
	//	System.out.println(this);
	}
}
public class Assignment6_3 
{

	public static void main(String[] args) 
	{
		MyDate1 obj1= new MyDate1();
		MyDate1.show();
	}

}

package javapractice1;

class A
{
	int integer(int a, int b)
	{
		int res= a+b;
		return res;
	}
	
	int integer(int a, int b, int c)
	{
		int res= a*b*c;
		return res;
	}
	double integer(int a, double b)
	{
		double res= a/b;
		return res;
	}
}

public class Assignment5_2 
{

	public static void main(String[] args) 
	{
		double res;
		A obj = new A();
		System.out.println(res= obj.integer(33, 65));
		System.out.println(res=obj.integer(2, 3, 4));
		System.out.println(res=obj.integer(100, 3.0));

	}

}

package javapractice1;

class Marks
{
	static int m1, m2, m3, total;
	static float average;
	
	static
	{
		m1= 57;
		m2= 95;
		m3= 35;
		total= m1+m2+m3;
		average= total/3;
		
	}
	void showVal()
	{
		System.out.println("Total marks of m1, m2 and m3 is: " + total);
		System.out.println("Average marks of m1, m2 and m3 is: " + average);
	}
}
public class Assignment6_1 
{

	public static void main(String[] args) 
	{
		Marks obj1= new Marks();
		obj1.showVal();
		

	}

}

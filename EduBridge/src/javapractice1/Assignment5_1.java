package javapractice1;

class Bank
{
	long acc_no, amount, dep, trans;
	String acc_name;
	
	void setVal()
	{
		acc_no = 10016034869l;
		amount = 150731;
		acc_name="Bheemanagowda";
		dep = 50000;
		trans =25000;
	}
	void getVal()
	{
		System.out.println("Account No: " + acc_no );
		System.out.println("Account holder Name: " + acc_name);
		System.out.println("Available balance amount is: " + amount);
		System.out.println("Deposit amount is: " + dep);
		System.out.println("Transaction amount is: " + trans);
	}
}

public class Assignment5_1 
{

	public static void main(String[] args) 
	{
		Bank obj= new Bank();
		obj.setVal();
		obj.getVal();
	}

}

package BankTransaction;

public class user 
{
	public Boolean userValidation(String accName, int passwd, String transaction, int amount)
	{
		Boolean condition;
		if(accName.equals("Bheema") && passwd == 12345)
			condition=true;
		else if (accName.equals("Rekha") && passwd == 12245)
			condition=true;
		else if (accName.equals("Siddu") && passwd == 54321)
			condition=true;
		else
			condition=false;
		return condition;
	}	
}

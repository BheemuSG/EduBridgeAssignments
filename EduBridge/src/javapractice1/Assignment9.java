package javapractice1;

class sample
{
	int age;
	String name;
	
	public sample copyobj(sample ob)
	{
		age=ob.age;
		name=ob.name;
		return ob;
	}
	
	void show()
	{
		System.out.println("Age is : " + age);
		System.out.println("Name is : " + name);
	}
}

public class Assignment9 
{

	public static void main(String[] args) 
	{
		//Array of object
		sample []obj = new sample [4];
		obj[0].age=29;
		obj[0].name="Bheemu";
		obj[2]=obj[1].copyobj(obj[0]);
		obj[3]=obj[4];
		
		for (int row[]:obj.length)
			for (int value:row)
			{
				System.out.println(value);
			}
		
	}

}

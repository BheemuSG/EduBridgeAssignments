package ObjectOriented;

public class CodeReusability 
{
	int div(int a, int b)
	{
		return (a/b);
	}
	int mul(int x, int y)
	{
		return (x*y);
	}
	public static void main(String[] args) 
	{
		//Object
		CodeReusability cr=new CodeReusability();
		System.out.println("Div: "+ cr.div(50, 5));
		System.out.println("Mul: "+ cr.mul(3, 3));
		
		//Code-Reusability
		Examples ex=new Examples();
		ex.add(2, 5);
		ex.sub();

	}
	
	
}

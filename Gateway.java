public class Gateway
{
	Gateway()
	{
		System.out.println("we are executing no parameter constructor of Gateway class");
	}
	
	Gateway(int number)
	{
		System.out.println("we are executing parameterized constructor of Gateway class");
		System.out.println(number);
	}
	
	public static void main(String[] args)
	{
		new Gateway();
		new Gateway(10);
	
	}
}
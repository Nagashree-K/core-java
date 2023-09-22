public class Apple
{
	Apple()
	{
		System.out.println("we are executing no parameter constructor of Apple class");
	}
	
	Apple(float value)
	{
		System.out.println("we are executing parameterized constructor of Apple class");
		System.out.println(value);
	}
	
	public static void main(String[] args)
	{
		new Apple();
		new Apple(10.5f);
	
	}
}
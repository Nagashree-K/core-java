public class HP
{
	HP()
	{
		System.out.println("we are executing no parameter constructor of HP class");
	}
	
	HP(double num)
	{
		System.out.println("we are executing parameterized constructor of HP class");
		System.out.println(num);
	}
	
	public static void main(String[] args)
	{
		new HP();
		new HP(1000.05);
	
	}
}
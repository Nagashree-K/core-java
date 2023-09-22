public class Lenovo
{
	Lenovo()
	{
		System.out.println("we are executing no parameter constructor of Lenovo class");
	}
	
	Lenovo(String msg)
	{
		System.out.println("we are executing parameterized constructor of Lenovo class");
		System.out.println(msg);
	}
	
	public static void main(String[] args)
	{
		new Lenovo();
		new Lenovo("Hello Constructor");
	
	}
}
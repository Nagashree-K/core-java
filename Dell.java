public class Dell
{
	Dell()
	{
		System.out.println("we are executing no parameter constructor of Dell class");
	}
	
	Dell(char letter)
	{
		System.out.println("we are executing parameterized constructor of Dell class");
		System.out.println(letter);
	}
	
	public static void main(String[] args)
	{
		new Dell();
		new Dell('A');
	
	}
}
public class Application
{
	static void checkMark(int mark)
	{
		if(mark>=75)
		{
			System.out.println("Result = Distiction" );
		}
		else if(mark<35)
		{
			System.out.println("Result = Fail" );
		}
		else
		{
			System.out.println("Result = Pass" );
		}
	}
	
	
	static void checkOffer(int grandTotal)
	{
		if(grandTotal>=3000)
		{
			System.out.println("You are eligible to get our special offer that is free 2kg of sugar" );
		}
		else if(grandTotal<=1000)
		{
			System.out.println("You are not eligible to get our special offer today" );
		}
		else
		{
			System.out.println("You are eligible to get our special offer that is free 1kg of sugar" );
		}
	}
	
	static void classifyTemperature(int temperature)
	{
		
		if(temperature>30)
		{
			System.out.println("It is hot outside" );
		}
		else if(temperature>=20)
		{
			System.out.println("It is warm outside" );
		}
		else
		{
			System.out.println("It is cold outside" );
		}
	}
	
	
	static void determineSoftware(String software)
	{
		
		if(software=="visual studio")
		{
			System.out.println("use this only in the advanced level" );
		}
		else if(software=="notepad++")
		{
			System.out.println("use this in the intermediate level" );
		}
		else
		{
			System.out.println("It is better to use Notepad++" );
		}
	}
	
	static void checkGST(int price)
	{
		
		if(price>=1000)
		{
			System.out.println("12% GST applied for this clothe" );
		}
		else if(price>=10)
		{
			System.out.println("6% GST applied for this clothe" );
		}
		else
		{
			System.out.println("Invalid price" );
		}
	}
	
	public static void main(String[] args)
	{
		checkMark(82);
		checkMark(32);
		checkMark(55);
		
		checkOffer(3500);
		checkOffer(2300);
		checkOffer(550);
		
		
		classifyTemperature(32);
		classifyTemperature(25);
		classifyTemperature(12);
		
		determineSoftware("visual studio");
		determineSoftware("notepad++");
		determineSoftware("notepad");
		
		checkGST(1450);
		checkGST(560);
		checkGST(9);
	}
}
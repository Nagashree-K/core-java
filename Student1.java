public class Student1
{
	String email;
	String name;
	String address;
	String studentID;
	
	Student1()
	{
		System.out.println("No details");
	}
	Student1(String email)
	{
		this();
		System.out.println("details having only email");
	}
	Student1(String email,String name)
	{
		this("ram");
		System.out.println("details having only email and name");
	}
	Student1(String email,String name,String address)
	{
		this(email,"ram");
		System.out.println("details having only email,name and address");
	}
	Student1(String email,String name,String address,String studentID)
	{
		this(email,name,"Shivamogga");
		System.out.println("details having email,name,address and studentID");
	}
	
	public static void main(String[] args)
	{
		new Student1("radha@gmail.com","radha","banglore","r11");
		
	}
}
public class Employee1
{
	String empID;
	String name;
	String position;
	String department;
	
	Employee1()
	{
		System.out.println("No details");
	}
	Employee1(String empID)
	{
		this();
		System.out.println("details having only empid");
	}
	Employee1(String empID,String name)
	{
		this("ram");
		System.out.println("details having only empid and empname");
	}
	Employee1(String empID,String name,String position)
	{
		this(empID,"ram");
		System.out.println("details having only empid,empname and position");
	}
	Employee1(String empID,String name,String position,String department)
	{
		this(empID,name,"traniee");
		System.out.println("details having empid,empname,position and empname");
	}
	
	public static void main(String[] args)
	{
		new Employee1("r11","radha","associate","TCS");
		
	}
}
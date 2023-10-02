public class Employee
{
	String empID;
	String firstName;
	String lastName;
	String position;
	String department;
	double salary;
	boolean isFullTime;
	String manager;
	String officeLocation;
	String email;
	
	Employee(String empID,String firstName,String lastName,String position,String department,double salary,boolean isFullTime,String manager,String officeLocation,String email)
	{
		this.empID=empID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.position=position;
		this.department=department;
		this.salary=salary;
		this.isFullTime=isFullTime;
		this.manager=manager;
		this.officeLocation=officeLocation;
		this.email=email;
	}
	public static void main(String[] args)
	{
		Employee obj1=new Employee("M11","alan","var","associate","IT",22000,true,"Mohan","BTM second stage","alan@gmail.com");
		System.out.println(obj1.empID);
		System.out.println(obj1.firstName);
		System.out.println(obj1.lastName);
		System.out.println(obj1.position);
		System.out.println(obj1.department);
		System.out.println(obj1.salary);
		System.out.println(obj1.isFullTime);
		System.out.println(obj1.manager);
		System.out.println(obj1.officeLocation);
		System.out.println(obj1.email);
		
		Employee obj2=new Employee("M12","ana","myk","associate","IT",22000,true,"Mohan","BTM second stage","ana@gmail.com");
		System.out.println(obj2.empID);
		System.out.println(obj2.firstName);
		System.out.println(obj2.lastName);
		System.out.println(obj2.position);
		System.out.println(obj2.department);
		System.out.println(obj2.salary);
		System.out.println(obj2.isFullTime);
		System.out.println(obj2.manager);
		System.out.println(obj2.officeLocation);
		System.out.println(obj2.email);
		
		Employee obj3=new Employee("M13","ram","k","associate","IT",22000,true,"Mohan","BTM second stage","ram@gmail.com");
		System.out.println(obj3.empID);
		System.out.println(obj3.firstName);
		System.out.println(obj3.lastName);
		System.out.println(obj3.position);
		System.out.println(obj3.department);
		System.out.println(obj3.salary);
		System.out.println(obj3.isFullTime);
		System.out.println(obj3.manager);
		System.out.println(obj3.officeLocation);
		System.out.println(obj3.email);
	}
}
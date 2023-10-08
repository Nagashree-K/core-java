public class EmployeeDetails
{
	String employeeName;
	int age;
	String employeeID;
	String address;
	int salary ;
	String email;
	String position;
	static String companyName;
	static String companyLocation;
	static String whatBasedCompany;
	
	
	static
	{
		companyName="TCS";
		companyLocation="Banglore";
		whatBasedCompany="service based";
	}

	EmployeeDetails(String employeeName,int age,String employeeID,String address,int salary,String email,String position)
	{
		this.employeeName=employeeName;
		this.age=age;
		this.employeeID=employeeID;
		this.address=address;
		this.salary=salary;
		this.email=email;
		this.position=position;
	}
	
	public static void main(String[] args)
	{
		EmployeeDetails obj1=new EmployeeDetails("manu",25,"M11","Thirthahalli",15000,"manu@gmail.com","associate");
		
		System.out.println(obj1.employeeName);
		System.out.println(obj1.age);
		System.out.println(obj1.employeeID);
		System.out.println(obj1.salary);
		System.out.println(obj1.address);
		System.out.println(obj1.email);
		System.out.println(obj1.position);
		System.out.println(companyName);
		System.out.println(companyLocation);
		System.out.println(whatBasedCompany);
		
		EmployeeDetails obj2=new EmployeeDetails("ananya",29,"M23","Sagara",16000,"ananya@gmail.com","opearation engineer");
		
		System.out.println(obj2.employeeName);
		System.out.println(obj2.age);
		System.out.println(obj2.employeeID);
		System.out.println(obj2.salary);
		System.out.println(obj2.address);
		System.out.println(obj2.email);
		System.out.println(obj2.position);
		System.out.println(companyName);
		System.out.println(companyLocation);
		System.out.println(whatBasedCompany);
		
		EmployeeDetails obj3=new EmployeeDetails("asha",25,"M23","banglore",16000,"asha@gmail.com","Tester");
		
		System.out.println(obj2.employeeName);
		System.out.println(obj2.age);
		System.out.println(obj2.employeeID);
		System.out.println(obj2.salary);
		System.out.println(obj2.address);
		System.out.println(obj2.email);
		System.out.println(obj2.position);
		System.out.println(companyName);
		System.out.println(companyLocation);
		System.out.println(whatBasedCompany);
	}
}
		
		
		
		
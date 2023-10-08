public class StudentDetails
{
	String name;
	int age;
	String registerNumber;
	String address;
	String course;
	String email;
	int semester;
	static String collegeName;
	static String collegeLocation;
	static int centreID;
	
	
	static
	{
		collegeName="PESIAMS";
		collegeLocation="Shivamogga";
		centreID=0150;
	}

	StudentDetails(String name,int age,String registerNumber,String address,String course,String email,int semester)
	{
		this.name=name;
		this.age=age;
		this.registerNumber=registerNumber;
		this.address=address;
		this.course=course;
		this.email=email;
		this.semester=semester;
	}
	
	public static void main(String[] args)
	{
		StudentDetails obj1=new StudentDetails("manu",21,"M11","Thirthahalli","BCA","manu@gmail.com",5);
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.registerNumber);
		System.out.println(obj1.address);
		System.out.println(obj1.course);
		System.out.println(obj1.email);
		System.out.println(obj1.semester);
		System.out.println(collegeName);
		System.out.println(collegeLocation);
		System.out.println(centreID);
		
		StudentDetails obj2=new StudentDetails("ananya",21,"M23","Sagara","BCA","ananya@gmail.com",5);
		
		System.out.println(obj2.name);
		System.out.println(obj2.age);
		System.out.println(obj2.registerNumber);
		System.out.println(obj2.address);
		System.out.println(obj2.course);
		System.out.println(obj2.email);
		System.out.println(obj2.semester);
		System.out.println(collegeName);
		System.out.println(collegeLocation);
		System.out.println(centreID);
		
		StudentDetails obj3=new StudentDetails("sahana",21,"M51","Sorabha","BCA","sahana@gmail.com",5);
		
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		System.out.println(obj3.registerNumber);
		System.out.println(obj3.address);
		System.out.println(obj3.course);
		System.out.println(obj3.email);
		System.out.println(obj3.semester);
		System.out.println(collegeName);
		System.out.println(collegeLocation);
		System.out.println(centreID);
	}
}
		
		
		
		
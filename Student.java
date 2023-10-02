public class Student
{
	String studentID;
	String studentName;
	int age;
	String address;
	String gender;
	String phoneNumber;
	String email;
	int firstSubjectMarks;
	int secondSubjectMarks;
	int thirdSubjectMarks;
	
	Student(String studentID,String studentName,int age,String address,String gender,String phoneNumber,String email,int firstSubjectMarks,int secondSubjectMarks,int thirdSubjectMarks)
		{
			this.studentID=studentID;
			this.studentName=studentName;
			this.age=age;
			this.address=address;
			this.gender=gender;
	        this.phoneNumber=phoneNumber;
			this.email=email;
			this.firstSubjectMarks=firstSubjectMarks;
			this.secondSubjectMarks=secondSubjectMarks;
			this.thirdSubjectMarks=thirdSubjectMarks;
		}
	public static void main(String[] args)
	{
		Student obj1=new Student("BC11","Manu",21,"Shivamogga","Male","9876543210","manu@gmail.com",98,87,95);
		System.out.println(obj1.studentID);
		System.out.println(obj1.studentName);
		System.out.println(obj1.age);
		System.out.println(obj1.address);
		System.out.println(obj1.gender);
		System.out.println(obj1.phoneNumber);
		System.out.println(obj1.email);
		System.out.println(obj1.firstSubjectMarks);
		System.out.println(obj1.secondSubjectMarks);
		System.out.println(obj1.thirdSubjectMarks);
		
		Student obj2=new Student("BC12","Shama",21,"Shivamogga","Female","9234143210","shama@gmail.com",66,47,715);
		System.out.println(obj2.studentID);
		System.out.println(obj2.studentName);
		System.out.println(obj2.age);
		System.out.println(obj2.address);
		System.out.println(obj2.gender);
		System.out.println(obj2.phoneNumber);
		System.out.println(obj2.email);
		System.out.println(obj2.firstSubjectMarks);
		System.out.println(obj2.secondSubjectMarks);
		System.out.println(obj2.thirdSubjectMarks);
		
		Student obj3=new Student("BC12","Ram",21,"Shivamogga","Male","9876542210","ram@gmail.com",28,37,35);
		System.out.println(obj3.studentID);
		System.out.println(obj3.studentName);
		System.out.println(obj3.age);
		System.out.println(obj3.address);
		System.out.println(obj3.gender);
		System.out.println(obj3.phoneNumber);
		System.out.println(obj3.email);
		System.out.println(obj3.firstSubjectMarks);
		System.out.println(obj3.secondSubjectMarks);
		System.out.println(obj3.thirdSubjectMarks);
	}
}
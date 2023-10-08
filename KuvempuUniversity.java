public class KuvempuUniversity
{
    int numberOfDepartment;
    int numberOfColleges;
    String departmentName;
	String departmentHOD;
    int roomNumber;
    int totalStudentsEnrolled;
    boolean isOnline;
    int creditHours;
    static String universityName;
    static String universityLocation;
	static int startedYear;
	
	static
	{
		String universityName="Kuvempu University";
		String universityLocation="Shankaragatta";
		startedYear=1966;
	}
    public KuvempuUniversity(int numberOfDepartment,int numberOfColleges,String departmentName,String departmentHOD,int roomNumber,int totalStudentsEnrolled,boolean isOnline, int creditHours) 
	{
        this.numberOfDepartment=numberOfDepartment;
		this.numberOfColleges=numberOfColleges;
		this.departmentName=departmentName;
		this.departmentHOD=departmentHOD;
		this.roomNumber=roomNumber;
		this.totalStudentsEnrolled=totalStudentsEnrolled;
		this.isOnline=isOnline;
		this.creditHours=creditHours;
    }
	public static void main(String[] args)
	{
		KuvempuUniversity college1=new KuvempuUniversity(10,15,"Computer Science","Roopa MS",15,1400,false,6);
		System.out.println(college1.numberOfDepartment);
		System.out.println(college1.numberOfColleges);
		System.out.println(college1.departmentName);
		System.out.println(college1.departmentHOD);
		System.out.println(college1.roomNumber);
		System.out.println(college1.totalStudentsEnrolled);
		System.out.println(college1.isOnline);
		System.out.println(college1.creditHours);
		System.out.println(universityName);
		System.out.println(universityLocation);
		System.out.println(startedYear);
		
		KuvempuUniversity college2=new KuvempuUniversity(10,15,"Commerce","Ramesh v",12,1220,false,6);
		System.out.println(college2.numberOfDepartment);
		System.out.println(college2.numberOfColleges);
		System.out.println(college2.departmentName);
		System.out.println(college2.departmentHOD);
		System.out.println(college2.roomNumber);
		System.out.println(college2.totalStudentsEnrolled);
		System.out.println(college2.isOnline);
		System.out.println(college2.creditHours);
		System.out.println(universityName);
		System.out.println(universityLocation);
		System.out.println(startedYear);
		
		KuvempuUniversity college3=new KuvempuUniversity(8,12,"arts","Poorna",12,1300,true,9);
		System.out.println(college3.numberOfDepartment);
		System.out.println(college3.numberOfColleges);
		System.out.println(college3.departmentName);
		System.out.println(college3.departmentHOD);
		System.out.println(college3.roomNumber);
		System.out.println(college3.totalStudentsEnrolled);
		System.out.println(college3.isOnline);
		System.out.println(college3.creditHours);
		System.out.println(universityName);
		System.out.println(universityLocation);
		System.out.println(startedYear);
	}	
}

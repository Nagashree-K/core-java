public class SKHostel
{
    int numberOfRooms;
	int numberOfStudents;
    boolean isVacant;
    double pricePerNight;
    String location;
    int sharing;
	String foodQuality;
    static String name;
    static String hostelType;
    static int maximumCapacity;
	
	static
	{
		name="SK Hostel";
		hostelType="Dormitory";
		maximumCapacity=300;
	}

    public SKHostel(int numberOfRooms,int numberOfStudents,boolean isVacant,double pricePerNight,String location,int sharing,String foodQuality)
	{
        this.numberOfRooms=numberOfRooms;
		this.numberOfStudents=numberOfStudents;
        this.isVacant=isVacant;
        this.pricePerNight=pricePerNight;
        this.location=location;
        this.sharing=sharing;
		this.foodQuality=foodQuality;
    }
	
	public static void main(String[] args)
	{
		SKHostel branch1=new SKHostel(30,250,true,250,"BTM",4,"Good");
		System.out.println(branch1.numberOfRooms);
		System.out.println(branch1.numberOfStudents);
		System.out.println(branch1.isVacant);
		System.out.println(branch1.pricePerNight);
		System.out.println(branch1.location);
		System.out.println(branch1.sharing);
		System.out.println(branch1.foodQuality);
		System.out.println(name);
		System.out.println(hostelType);
		System.out.println(maximumCapacity);
		
		SKHostel branch2=new SKHostel(40,280,false,250,"RR nagar",3,"Good");
		System.out.println(branch2.numberOfRooms);
		System.out.println(branch2.numberOfStudents);
		System.out.println(branch2.isVacant);
		System.out.println(branch2.pricePerNight);
		System.out.println(branch2.location);
		System.out.println(branch2.sharing);
		System.out.println(branch2.foodQuality);
		System.out.println(name);
		System.out.println(hostelType);
		System.out.println(maximumCapacity);
		
		SKHostel branch3=new SKHostel(30,230,true,270,"Bommanahalli",5,"very Good");
		System.out.println(branch3.numberOfRooms);
		System.out.println(branch3.numberOfStudents);
		System.out.println(branch3.isVacant);
		System.out.println(branch3.pricePerNight);
		System.out.println(branch3.location);
		System.out.println(branch3.sharing);
		System.out.println(branch3.foodQuality);
		System.out.println(name);
		System.out.println(hostelType);
		System.out.println(maximumCapacity);
	}	
		
}
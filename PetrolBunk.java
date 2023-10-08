public class PetrolBunk 
{
    int numberOfPumps;
    int numberOfEmployees;
    String location;
    String ownerName;
    int dailyRevenue;
    int totalLitersSold;
    boolean is24Hours;
    double petrolPrice;
    static String company;
    static String headquarters;
    static int establishedYear;

    static 
	{
        company = "XYZ Petrol";
        headquarters = "BTM Layout";
        establishedYear = 1990;
    }

    public PetrolBunk(int numberOfPumps, int numberOfEmployees, String location, String ownerName,int dailyRevenue, int totalLitersSold, boolean is24Hours, double petrolPrice) 
	{
        this.numberOfPumps = numberOfPumps;
        this.numberOfEmployees = numberOfEmployees;
        this.location = location;
        this.ownerName = ownerName;
        this.dailyRevenue = dailyRevenue;
        this.totalLitersSold = totalLitersSold;
        this.is24Hours = is24Hours;
        this.petrolPrice = petrolPrice;
    }

    public static void main(String[] args) 
	{
        PetrolBunk bunk1 = new PetrolBunk(5, 10, "123 Main Street", "John Doe", 5000, 1000, true, 4.50);
        System.out.println(bunk1.numberOfPumps);
        System.out.println(bunk1.numberOfEmployees);
        System.out.println(bunk1.location);
        System.out.println(bunk1.ownerName);
        System.out.println(bunk1.dailyRevenue);
        System.out.println(bunk1.totalLitersSold);
        System.out.println(bunk1.is24Hours);
        System.out.println(bunk1.petrolPrice);
        System.out.println(company);
        System.out.println(headquarters);
        System.out.println(establishedYear);

        PetrolBunk bunk2 = new PetrolBunk(3, 8, "456 Oak Street", "Jane Smith", 4000, 800, false, 4.75);
        System.out.println(bunk2.numberOfPumps);
        System.out.println(bunk2.numberOfEmployees);
        System.out.println(bunk2.location);
        System.out.println(bunk2.ownerName);
        System.out.println(bunk2.dailyRevenue);
        System.out.println(bunk2.totalLitersSold);
        System.out.println(bunk2.is24Hours);
        System.out.println(bunk2.petrolPrice);
        System.out.println(company);
        System.out.println(headquarters);
        System.out.println(establishedYear);

		PetrolBunk bunk3 = new PetrolBunk(2, 7, "231 Om Street", "Smith", 4020, 810, true, 4.75);
        System.out.println(bunk3.numberOfPumps);
        System.out.println(bunk3.numberOfEmployees);
        System.out.println(bunk3.location);
        System.out.println(bunk3.ownerName);
        System.out.println(bunk3.dailyRevenue);
        System.out.println(bunk3.totalLitersSold);
        System.out.println(bunk3.is24Hours);
        System.out.println(bunk3.petrolPrice);
        System.out.println(company);
        System.out.println(headquarters);
        System.out.println(establishedYear);
	}
	
	
}

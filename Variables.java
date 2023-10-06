public class Variables
{
	public static void main(String[] args)
	{	
		//declaring String variables using literals
		String firstName="John";
		String lastName="Var";
		String email="johndoe@example.com";
		String username="johndoe123";
		String password="SecurePassword123";
		String address="123 Main Street";
		String city="New York";
		String state="New York";
		String zipcode="10001";
		String phoneNumber="(555) 123-4567";
		String companyName="ABC";
		String jobTitle="Software Engineer";
		String productCode="PROD12345";
		String orderNumber="ORD7890";
		String customerName="Jane Smith";
		String invoiceNumber="INV5678";
		String projectName="Project X";
		String department="HR";
		String category="Electronics";
		String eventTitle="Annual Conference";
		String eventName="Wedding Reception";
		String eventLocation="Grand Ballroom";
		String eventDate="2023-10-15";
		String taskName="Task A";
		String taskDescription="Complete project proposal";
		String productCategory="Clothing";
		String productDescription="Men's T-shirt";
		String supplierName="Fashion Mart";
		String manufacturer="TechCo";
		String modelNumber="M1234";
		
		
		//reassigning value to declared variables
		lastName="Doe";
		state="NY";
		companyName="ABC inc.";
		projectName="garbage sensor";
		department="Testing";
		
		//declaring String objects using new keyword
		String serialNumber = new String("SN56789");
		String websiteURL = new String("https://example.com");
		String socialMediaHandle = new String("@user123");
		String comment = new String("Great job!");
		String review = new String("5-star rating");
		String currency = new String("USD");
		String language = new String("English");
		String country = new String("Canada");
		String color = new String("Blue");
		String foodItem = new String("Pizza");
		String drink = new String("Coffee");
		String bookTitle = new String("The Great Gatsby");
		String author = new String("F. Scott Fitzgerald");
		String movieTitle = new String("Inception");
		String actor = new String("Leonardo DiCaprio");
		String musicGenre = new String("Rock");
		String songTitle = new String("Bohemian Rhapsody");
		String playlistName = new String("Chill Vibes");
		String sport = new String("Soccer");
		String teamName = new String("Manchester United");
		String tournamentName = new String("World");
		String carMake = new String("Toyota");
		String carModel = new String("Camry");
		String licensePlate = new String("ABC123");
		String airlineName = new String("Delta Air Lines");
		String flightNumber = new String("DL123");
		String hotelName = new String("Grand Hotel");
		String roomType = new String("Suite");
		String reservationNumber = new String("RES456");
		String eventOrganizer = new String("EventPro");

		
		//reassigning value to declared object reference
		tournamentName="World cup";
		hotelName="Hotel Thar";
		drink="Tea";
		musicGenre="melody";
		color="Red";
	
		//checking whether any variables points out to same address of String values
		System.out.println(firstName==username);
		System.out.println(city==state);
		System.out.println(address==eventLocation);
		System.out.println(productCode==modelNumber);
		System.out.println(manufacturer==customerName);
		
		System.out.println(socialMediaHandle==username);
		System.out.println(bookTitle==movieTitle);
		System.out.println(foodItem==drink);
		System.out.println(serialNumber==modelNumber);
		System.out.println(carMake==carModel);
	}
}
	
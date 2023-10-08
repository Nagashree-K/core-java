public class SedanCar
{
    String make;
    String model;
    int year;
    double price;
	String color;
    boolean isAutomatic;
    double averagePrice;
    static String carCategory="Sedan";
    static boolean hasAirbags=true;
    static String fuelType="Gasoline";
	
	static
	{
		String carCategory="Sedan";
		boolean hasAirbags=true;
		String fuelType="Gasoline";
	}

    public SedanCar(String make,String model,int year,double price,String color,boolean isAutomatic,double averagePrice) 
	{
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
		this.color=color;
        this.isAutomatic = isAutomatic;
		this.averagePrice=averagePrice;
	}
	public static void main(String[] args)
	{
		SedanCar obj1=new SedanCar("Toyota","cambry",2022,205000,"black",false,105000);
		
		System.out.println(obj1.make);
		System.out.println(obj1.model);
		System.out.println(obj1.year);
		System.out.println(obj1.price);
		System.out.println(obj1.color);
		System.out.println(obj1.isAutomatic);
		System.out.println(obj1.averagePrice);
		System.out.println(carCategory);
		System.out.println(hasAirbags);
		System.out.println(fuelType);
		
		SedanCar obj2=new SedanCar("Honda","civic",2021,225000,"blue",false,105000);
		
		System.out.println(obj2.make);
		System.out.println(obj2.model);
		System.out.println(obj2.year);
		System.out.println(obj2.price);
		System.out.println(obj2.color);
		System.out.println(obj2.isAutomatic);
		System.out.println(obj2.averagePrice);
		System.out.println(carCategory);
		System.out.println(hasAirbags);
		
		SedanCar obj3=new SedanCar("Ford","F-150",2021,20000,"black",true,125000);
		
		System.out.println(obj3.make);
		System.out.println(obj3.model);
		System.out.println(obj3.year);
		System.out.println(obj3.price);
		System.out.println(obj3.color);
		System.out.println(obj3.isAutomatic);
		System.out.println(obj3.averagePrice);
		System.out.println(carCategory);
		System.out.println(hasAirbags);
	}
		
}

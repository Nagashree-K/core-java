public class Car
{
	String make;
	String model;
	int year;
	String fuelType;
	double mileage;
	boolean isAutomatic;
	String color;
	float engineSize;
	boolean isElectric;
	double price;
	
	Car(String make,String model,int year,String fuelType,double mileage,boolean isAutomatic,String color,float engineSize,boolean isElectric,double price)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		this.fuelType=fuelType;
		this.mileage=mileage;
		this.isAutomatic=isAutomatic;
		this.color=color;
		this.engineSize=engineSize;
		this.isElectric=isElectric;
		this.price=price;
	}
	public static void main(String[] args)
	{
		Car obj1=new Car("Maruthi","V5",2023,"diesel",100,false,"blue",8.9f,true,3600000);
		System.out.println(obj1.make);
		System.out.println(obj1.model);
		System.out.println(obj1.year);
		System.out.println(obj1.fuelType);
		System.out.println(obj1.mileage);
		System.out.println(obj1.isAutomatic);
		System.out.println(obj1.color);
		System.out.println(obj1.engineSize);
		System.out.println(obj1.isElectric);
		System.out.println(obj1.price);
		
		Car obj2=new Car("Maruthi","V9",2022,"diesel",100,false,"black",8.9f,true,3200000);
		System.out.println(obj2.make);
		System.out.println(obj2.model);
		System.out.println(obj2.year);
		System.out.println(obj2.fuelType);
		System.out.println(obj2.mileage);
		System.out.println(obj2.isAutomatic);
		System.out.println(obj2.color);
		System.out.println(obj2.engineSize);
		System.out.println(obj2.isElectric);
		System.out.println(obj2.price);
		
		Car obj3=new Car("Maruthi","V11",2021,"petrol",100,true,"white",8.9f,true,3800000);
		System.out.println(obj3.make);
		System.out.println(obj3.model);
		System.out.println(obj3.year);
		System.out.println(obj3.fuelType);
		System.out.println(obj3.mileage);
		System.out.println(obj3.isAutomatic);
		System.out.println(obj3.color);
		System.out.println(obj3.engineSize);
		System.out.println(obj3.isElectric);
		System.out.println(obj3.price);
	}
}
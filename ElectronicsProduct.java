public class ElectronicsProduct
{
    String name;
    double price;
    int quantity;
    String description;
    String manufacturer;
    boolean isAvailable;
	String color;
	static String quality;
    static String category;
    static double discountRate;
	
	static
	{
		quality="Best";
		category="Electronics";
		discountRate=0.1;
	}

    public ElectronicsProduct(String name,double price,int quantity,String description,String manufacturer,boolean isAvailable,String color)
	{
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.description=description;
        this.manufacturer=manufacturer;
        this.isAvailable=isAvailable;
		this.color=color;
    }
	
	public static void main(String[] args)
	{
		ElectronicsProduct obj1=new ElectronicsProduct("Speaker",10,1000,"speaker","XYZ",true,"black");
		System.out.println(obj1.name);
		System.out.println(obj1.price);
		System.out.println(obj1.quantity);
		System.out.println(obj1.description);
		System.out.println(obj1.manufacturer);
		System.out.println(obj1.isAvailable);
		System.out.println(obj1.color);
		System.out.println(quality);
		System.out.println(category);
		System.out.println(discountRate);
		
		ElectronicsProduct obj2=new ElectronicsProduct("tablet",10,2000,"tablet","MNO",false,"blue");
		System.out.println(obj2.name);
		System.out.println(obj2.price);
		System.out.println(obj2.quantity);
		System.out.println(obj2.description);
		System.out.println(obj2.manufacturer);
		System.out.println(obj2.isAvailable);
		System.out.println(obj2.color);
		System.out.println(quality);
		System.out.println(category);
		System.out.println(discountRate);
		
		ElectronicsProduct obj3=new ElectronicsProduct("ac",10,3500,"ac","PGO",true,"black");
		System.out.println(obj3.name);
		System.out.println(obj3.price);
		System.out.println(obj3.quantity);
		System.out.println(obj3.description);
		System.out.println(obj3.manufacturer);
		System.out.println(obj3.isAvailable);
		System.out.println(obj3.color);
		System.out.println(quality);
		System.out.println(category);
		System.out.println(discountRate);
	}
}	

    
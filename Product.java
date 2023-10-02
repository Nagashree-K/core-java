public class Product
{
	String productID;
	String productName;
	double price;
	int quantityInStock;
	String description;
	String Manufacturer;
	boolean isAvailable;
	String color;
	float wieght;
	String category;
	
	Product(String productID,String productName,double price,int quantityInStock,String description,String Manufacturer,boolean isAvailable,String color,float wieght,String category)
	{
		this.productID=productID;
		this.productName=productName;
		this.price=price;
		this.quantityInStock=quantityInStock;
		this.description=description;
		this.Manufacturer=Manufacturer;
		this.isAvailable=isAvailable;
		this.color=color;
		this.wieght=wieght;
		this.category=category;
	}
	public static void main(String[] args)
	{
		Product obj1=new Product("BC11","Pen",10,50,"blue writing pen","ana",true,"blue",5.5f,"Stationary");
		System.out.println(obj1.productID);
		System.out.println(obj1.productName);
		System.out.println(obj1.price);
		System.out.println(obj1.quantityInStock);
		System.out.println(obj1.description);
		System.out.println(obj1.Manufacturer);
		System.out.println(obj1.isAvailable);
		System.out.println(obj1.color);
		System.out.println(obj1.wieght);
		System.out.println(obj1.category);
		
		Product obj2=new Product("BC12","Pencil",10,50,"writing pencil","ana",true,"gray",5.5f,"Stationary");
		System.out.println(obj2.productID);
		System.out.println(obj2.productName);
		System.out.println(obj2.price);
		System.out.println(obj2.quantityInStock);
		System.out.println(obj2.description);
		System.out.println(obj2.Manufacturer);
		System.out.println(obj2.isAvailable);
		System.out.println(obj2.color);
		System.out.println(obj2.wieght);
		System.out.println(obj2.category);
		
		Product obj3=new Product("BC13","Sharpener",10,50,"pencil sharpener","ana",true,"yellow",5.5f,"Stationary");
		System.out.println(obj3.productID);
		System.out.println(obj3.productName);
		System.out.println(obj3.price);
		System.out.println(obj3.quantityInStock);
		System.out.println(obj3.description);
		System.out.println(obj3.Manufacturer);
		System.out.println(obj3.isAvailable);
		System.out.println(obj3.color);
		System.out.println(obj3.wieght);
		System.out.println(obj3.category);
	}
}
public class KVGBook
{
    String title;
    String author;
    int publicationYear;
    int numberOfChapter;
    double price;
    int pageCount;
    boolean isHardcover;
	static double averagePrice;
	static String genre;
    static String publisher;

   static
   {
		averagePrice=250;
		genre="Fiction";
		publisher="KVG Publication";
	}

    public KVGBook(String title,String author,int publicationYear,int numberOfChapter,double price,int pageCount,boolean isHardcover)
	{
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
		this.numberOfChapter=numberOfChapter;
        this.price=price;
        this.pageCount=pageCount;
        this.isHardcover=isHardcover;
    }

    public static void main(String[] args)
	{
		KVGBook obj1=new KVGBook("Secret","Thomas",2022,12,430,105,true);
		
		System.out.println(obj1.title);
		System.out.println(obj1.author);
		System.out.println(obj1.publicationYear);
		System.out.println(obj1.numberOfChapter);
		System.out.println(obj1.price);
		System.out.println(obj1.pageCount);
		System.out.println(averagePrice);
		System.out.println(genre);
		System.out.println(publisher);
		
		KVGBook obj2=new KVGBook("Happiness","Saara",2021,8,360,90,true);
		
		System.out.println(obj2.title);
		System.out.println(obj2.author);
		System.out.println(obj2.publicationYear);
		System.out.println(obj2.numberOfChapter);
		System.out.println(obj2.price);
		System.out.println(obj2.pageCount);
		System.out.println(averagePrice);
		System.out.println(genre);
		System.out.println(publisher);
		
		KVGBook obj3=new KVGBook("star","Annaa",2022,10,410,125,false);
	
		System.out.println(obj3.title);
		System.out.println(obj3.author);
		System.out.println(obj3.publicationYear);
		System.out.println(obj3.numberOfChapter);
		System.out.println(obj3.price);
		System.out.println(obj3.pageCount);
		System.out.println(averagePrice);
		System.out.println(genre);
		System.out.println(publisher);
		
    }
}

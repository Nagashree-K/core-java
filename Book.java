public class Book
{
	String title;
	String author;
	String isbn;
	int pageCount;
	int chapterCount;
	boolean isHardCover;
	String language;
	String genre;
	double price;
	boolean isAvailable;
	
	Book(String title,String author,String isbn,int pageCountint,int chapterCount,boolean isHardCover,String language,String genre,double price,boolean isAvailable)
	{
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.pageCount=pageCount;
		this.chapterCount=chapterCount;
		this.isHardCover=isHardCover;
		this.language=language;
		this.genre=genre;
		this.price=price;
		this.isAvailable=isAvailable;
	}
	public static void main(String[] args)
	{
		Book obj1=new Book("Maruthi","alan","var",230,10,false,"English","suspense",240,true);
		System.out.println(obj1.title);
		System.out.println(obj1.author);
		System.out.println(obj1.isHardCover);
		System.out.println(obj1.isbn);
		System.out.println(obj1.pageCount);
		System.out.println(obj1.chapterCount);
		System.out.println(obj1.language);
		System.out.println(obj1.genre);
		System.out.println(obj1.price);
		System.out.println(obj1.isAvailable);
		
		Book obj2=new Book("Horror","ana","myk",280,10,false,"English","suspense",240,true);
		System.out.println(obj2.title);
		System.out.println(obj2.author);
		System.out.println(obj2.isHardCover);
		System.out.println(obj2.isbn);
		System.out.println(obj2.pageCount);
		System.out.println(obj2.chapterCount);
		System.out.println(obj2.language);
		System.out.println(obj2.genre);
		System.out.println(obj2.price);
		System.out.println(obj2.isAvailable);
		
		Book obj3=new Book("Fear","Thomas","var",290,10,false,"English","suspense",240,true);
		System.out.println(obj3.title);
		System.out.println(obj3.author);
		System.out.println(obj3.isHardCover);
		System.out.println(obj3.isbn);
		System.out.println(obj3.pageCount);
		System.out.println(obj3.chapterCount);
		System.out.println(obj3.language);
		System.out.println(obj3.genre);
		System.out.println(obj3.price);
		System.out.println(obj3.isAvailable);
	}
}
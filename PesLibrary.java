public class PesLibrary
{
    int numberOfBooks;
    int numberOfMembers;
    String libraryName;
    String librarianName;
    int roomNumber;
    boolean isOpen;
    int maxBorrowDuration;
    static String universityName;
    static String universityLocation;
    static int establishedYear;

    static 
	{
        universityName = "PES University Library";
        universityLocation = "Bangalore";
        establishedYear = 1972;
    }

    public PesLibrary(int numberOfBooks, int numberOfMembers, String libraryName, String librarianName,int roomNumber, boolean isOpen, int maxBorrowDuration) 
	{
        this.numberOfBooks = numberOfBooks;
        this.numberOfMembers = numberOfMembers;
        this.libraryName = libraryName;
        this.librarianName = librarianName;
        this.roomNumber = roomNumber;
        this.isOpen = isOpen;
        this.maxBorrowDuration = maxBorrowDuration;
    }

    public static void main(String[] args) 
	{
        PesLibrary library1 = new PesLibrary(50000, 2000, "Main Library", "John Doe", 101, true, 30);
        System.out.println(library1.numberOfBooks);
        System.out.println(library1.numberOfMembers);
        System.out.println(library1.libraryName);
        System.out.println(library1.librarianName);
        System.out.println(library1.roomNumber);
        System.out.println(library1.isOpen);
        System.out.println(library1.maxBorrowDuration);
        System.out.println(universityName);
        System.out.println(universityLocation);
        System.out.println(establishedYear);

        PesLibrary library2 = new PesLibrary(30000, 1500, "Branch Library", "Jane Smith", 201, true, 21);
        System.out.println(library2.numberOfBooks);
        System.out.println(library2.numberOfMembers);
        System.out.println(library2.libraryName);
        System.out.println(library2.librarianName);
        System.out.println(library2.roomNumber);
        System.out.println(library2.isOpen);
        System.out.println(library2.maxBorrowDuration);
        System.out.println(universityName);
        System.out.println(universityLocation);
        System.out.println(establishedYear);
		
		PesLibrary library3 = new PesLibrary(34000, 1550, "Sub Library", "Smith", 221,false, 22);
        System.out.println(library3.numberOfBooks);
        System.out.println(library3.numberOfMembers);
        System.out.println(library3.libraryName);
        System.out.println(library3.librarianName);
        System.out.println(library3.roomNumber);
        System.out.println(library3.isOpen);
        System.out.println(library3.maxBorrowDuration);
        System.out.println(universityName);
        System.out.println(universityLocation);
        System.out.println(establishedYear);
    }
}
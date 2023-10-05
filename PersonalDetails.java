public class PersonalDetails
{
	public static void main(String[] args)
	{
		
		String firstName="Nagashree";
		String lastName="   K";
		String address="Shivamogga";
		String collegeName="PESIAMS";
		String degree="bca";
		String registerNumber="BA200";
		String university="Kuvempu University";
		String collegeLocation="shivamogga";
		String result="Distinction";
		String status="graduated";
	
	
		int length=firstName.length();
		System.out.println(length);
		
		String trimmedString=lastName.trim();
		System.out.println(trimmedString);
		
		boolean checkedResult=address.equals(collegeLocation);
		System.out.println(checkedResult);
		
		char checkedCharacter=registerNumber.charAt(1);
		System.out.println(checkedCharacter);
		
		String convertedStringToUpper=degree.toUpperCase();
		System.out.println(convertedStringToUpper);
		
		String convertedStringToLower=registerNumber.toLowerCase();
		System.out.println(convertedStringToLower);
		
		String percentage=String.valueOf(88.08f);
		System.out.println(percentage);
		
		int asciiValue=status.codePointAt(5);
		System.out.println(asciiValue);
		
		boolean checkedValue=address.equalsIgnoreCase(collegeLocation);
		System.out.println(checkedValue);
		
		String joinedString=firstName.concat(trimmedString);
		System.out.println(joinedString);
		
		String correctedString=registerNumber.replace('A','C');
		System.out.println(correctedString);
		
		int beforeAsciiValue=status.codePointAt(5);
		System.out.println(beforeAsciiValue);
		
		boolean startingWord=status.startsWith("Kuvempu");
		System.out.println(startingWord);
		
		boolean endingWord=status.endsWith("university");
		System.out.println(endingWord);
		
		int indexValue=result.indexOf('n');
		System.out.println(indexValue);
		
		String[] splittedString=university.split(" ");
		for(int i=0;i<splittedString.length;i++)
					System.out.println(splittedString[i]);
		
		char[] charArray=university.toCharArray();
		for(int i=0;i<charArray.length;i++)
					System.out.println(charArray[i]);
		
	}
}
		
		
		
		
	
	
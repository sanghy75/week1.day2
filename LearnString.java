package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		String str = "Have a good day";
		int strLength = str.length();
		System.out.println("Length of the string :" + strLength);
		
		char val = str.charAt(8);
		System.out.println("Value at 6th Index is : " +val);
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		//Get the position of a character in the string
		int indexOf = str.indexOf('g');
		System.out.println("Index of charecter g :" + indexOf);
		
		// Get the last position of a character in the string
		int lastIndexOf = str.lastIndexOf('a');
		System.out.println("Last index of charecter a :" +lastIndexOf);
		
		//Convert a string to character array
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("charArray ["+i+"]: "  +charArray[i]);
		}
		
		// Convert a string to word
		String[] splitArr = str.split(" ");
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println("splitArr ["+i+"]: "  +splitArr[i]);
		}
		
		//Get a part of the string
		String substring = str.substring(5);
		System.out.println("Substring from 5 : " +substring);
		
		String substring2 = str.substring(5, 9);
		System.out.println("Substring from 5 to 9 : " +substring2);
		
		//Replace a character
		String repchr = str.replace('g', 'm');
		System.out.println("Replace string : " + repchr);
		
		//Compare two strings
		// ==
		
		// equal()
		
	}

}

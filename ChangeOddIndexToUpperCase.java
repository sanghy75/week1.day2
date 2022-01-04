package week1.day2;

public class ChangeOddIndexToUpperCase {
	//welcome - wElCoMe
	public static void main(String[] args) {
		String str = "welcome";
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i%2 !=0) {
				char upperCase = Character.toUpperCase(charArray[i]);
				System.out.println(upperCase);
				
			} else {
				System.out.println(charArray[i]);

			}
		}
	

	}

}

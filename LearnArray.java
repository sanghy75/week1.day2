package week1.day2;

import java.util.Arrays;

public class LearnArray {

	
	public static void main(String[] args) {
	int numArray[] = {100,49,398,34,1,267};
	
	int lenArray = numArray.length;
	System.out.println(" Length of the Array :" + lenArray);
	
	for (int i = 0; i < lenArray; i++) {
		System.out.println("numArray["+i+"] :"  + numArray[i]);
	
		
	}
	Arrays.sort(numArray);
	System.out.println("Sorted Array");
	for (int i = 0; i < lenArray; i++) {
		System.out.println("numArray["+i+"] :"  + numArray[i]);
	
	}
	System.out.println("second largest number :" +numArray[lenArray-2]);
	System.out.println("second smallest number :" +numArray[1]);
	}

}

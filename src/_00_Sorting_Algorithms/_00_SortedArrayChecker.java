package _00_Sorting_Algorithms;

import java.util.Arrays;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	public static boolean intArraySorted(int [] intArray) {
		for (int i = 1;i<intArray.length;i++) {
			if (intArray [i-1]>intArray[i] ) {
				return false;
			}
		}
		return true;
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	public static boolean doubleArraySorted(double [] doubleArray) {

		for (int i = 1;i<doubleArray.length;i++) {
			if (doubleArray [i-1]>doubleArray[i] ) {
				return false;
			}
		}
		return true;
	}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	public static boolean charArraySorted(char [] charArray) {

		for (int i = 1;i<charArray.length;i++) {
			if (charArray [i-1]>charArray[i] ) {
				return false;
			}
		}
		return true;
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	public static boolean stringArraySorted(String [] stringArray) {

		for (int i = 1;i<stringArray.length;i++) {
			if (stringArray [i-1].compareTo(stringArray[i])>0 ) {
				return false;
			}
		}
		return true;
	}

}

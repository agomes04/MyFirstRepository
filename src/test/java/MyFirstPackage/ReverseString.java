// RESERVSE STRING

package MyFirstPackage;

import java.util.Scanner;

public class ReverseString {

	static String original;
	static StringBuilder reverseText;

	public static void main(String[] args) {
		// Scanner SCNR = new Scanner(System.in);
		// System.out.println("Enter your test here to reverse : ");
		// original = SCNR.nextLine();

		/*
		 * original = "VIncent"; StringBuilder builder = new StringBuilder(original);
		 * 
		 * 
		 * reverseText = builder.reverse();
		 * 
		 * System.out.println(reverseText);
		 * 
		 */ 
		  System.out.println("Please enter a name: ");
		 
		Scanner scan = new Scanner(System.in);
		 
		 
		 
		 String name = scan.nextLine();
		 
		String str1 [] = name.split(" ");		 
		String emptyString ="";
		 
		for( int i = str1.length-1; i>=0;i--) {
		 
		emptyString = emptyString + str1[i] + " ";
		
		 
		 }
		 
		  System.out.println(emptyString);
		 
//		int[] nums = { 1, 2, 3, 4, 5 };
//
//		for (int i : nums) {
//			System.out.println(i);
//		}

	}

}

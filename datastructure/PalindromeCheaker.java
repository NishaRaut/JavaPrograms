package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class PalindromeCheaker {
	public static void main(String[] args) {
		System.out.println("Enter Word to check the word is pallindrome or not");
		String word = Utility.next();
		boolean isPalindrome = Utility.palindromeChecker(word);
		System.out.println();
		if(isPalindrome)
			System.out.println(word+" is Pallindrome");
		else
			System.out.println(word+" is not Pallindrome");
}

}

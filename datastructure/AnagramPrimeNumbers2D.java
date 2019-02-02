package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class AnagramPrimeNumbers2D {
	public static void main(String[] args) {
		System.out.println("Enter the range of the prime number");
		int number = Utility.getInt();
		String anagram[][] = Utility.anagramPrimeNumberIn2DArrays(number);
		for(int i=0; i<anagram.length; i++) {
			for(int j=0; j<anagram[0].length; j++) {
				if(anagram[i][j] != null)
					System.out.printf(anagram[i][j]+" ");
			}
			if(anagram[i][0] != null)
				System.out.println();
}

}
}
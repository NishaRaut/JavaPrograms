package com.bridgelabz.algorithm;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class SwapNibbleAndToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		String binary=Utility.toBinary(no);
		String eightBit = Utility.eightDigit(binary);
		System.out.println("Binary conversion is:"+eightBit);
		System.out.println("After swapping no is:");
		long swapped = Long.parseLong(Utility.swappedNibble(eightBit));
		System.out.println("Decimal conversion is:"+(Utility.toDecimal(eightBit)));

	}

}

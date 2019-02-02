package com.bridgelabz.algorithm;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class ToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		String binary=Utility.toBinary(no);
		String eightBit = Utility.eightDigit(binary);
		System.out.println("Binary conversion is:"+eightBit);

	}
}

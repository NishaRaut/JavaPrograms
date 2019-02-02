package com.bridgelabz.algorithm;
import java.util.Scanner;


import com.bridgelabz.utility.Utility;
public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				int sum=0;
		System.out.println("Enter the amount:");
		int amount=sc.nextInt();
		System.out.println("Minimum number of notes required:"+Utility.fewest(amount, sum));

	}

}

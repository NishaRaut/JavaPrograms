package com.bridgelabz.algorithm;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;


public class PrimeNo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the number for range:");
		int no=sc.nextInt();
		System.out.println("The prime numbers between 1 to above  are:");
		Utility.primeInRange(no);
	}

}

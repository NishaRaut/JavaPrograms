package com.bridgelabz.algorithm;

import java.util.Scanner;


import com.bridgelabz.utility.Utility;

public class PrimePalindromeAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number for range:");
	int num=sc.nextInt();
	System.out.println("Palindrome prime numbers are:");
	for(int i=2;i<=num;i++)
	{
		
		
		if(Utility.primeNo(i) && Utility.isPalindrome(i))
		{
			System.out.println(i+" ");
		}
		

	
	}
	System.out.println("Anagram prime numbers are:");
	for(int i=2;i<=num;i++)
	{
		if(Utility.primeNo(i) && Utility.isNumberAnagram(i))
		{
			System.out.println(i+" ");
		}
		

	
	}
	}

}

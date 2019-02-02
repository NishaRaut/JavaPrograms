package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class AnagramDetection {
     public static void main(String[] args)
{
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the first string:");
    	 String str1=sc.nextLine();
    	 System.out.println("Enter the first string:");
    	 String str2=sc.nextLine();
    	 
    	char[] s1= str1.toCharArray();
    	 char[] s2=str2.toCharArray();
    	 if(Utility.anagram(s1, s2)) {
 			System.out.println(" Above Strings are Anagram");
 		}
 		else {
 			System.out.println("Above Strings are not Anagram");
 }
}
}

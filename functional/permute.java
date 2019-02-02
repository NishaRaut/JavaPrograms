package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;



public class permute 
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s1=sc.next();
	
	System.out.println("possible permutations are:");
	int length=s1.length();
     Utility.permutation(s1, 0, length-1);
   }

}
 
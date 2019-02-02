package com.bridgelabz.algorithm;
import java.util.Scanner;


import com.bridgelabz.utility.Utility;
public class SqrtNewton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int no=sc.nextInt();
      System.out.println("Sqare root of the number is:"+Utility.sqrt(no));
         
      
	}
}

package com.bridgelabz.algorithm;
import java.util.Scanner;


import com.bridgelabz.utility.Utility;
public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("no:");
		int no=sc.nextInt();
		for(int i=0;i<=no;i++)
		{
			if(Utility.primeNo(i))
			{
				System.out.println(i+" ");
			}
		}

	}

}

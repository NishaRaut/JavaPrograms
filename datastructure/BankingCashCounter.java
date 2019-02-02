package com.bridgelabz.datastructure;

import com.bridgelabz.dataMethods.Queue;

import com.bridgelabz.utility.Utility;

public class BankingCashCounter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double balance=10000;
		System.out.println("Available balance="+balance);
		System.out.println("Enter how many people come for withdrow or diposit the cash:");
		int number=Utility.getInt();
		
		
		Queue<String> que = new Queue<String>(number);
		System.out.println("Enter names of the people");
		for(int i=0; i<number; i++) 
		{
			String name = Utility.next();
			que.enQueue(name);
		}
         System.out.println();
         double finalBalance = Utility.BankingCashCounter(number, que,balance);
 		
 		
         System.out.println("\nBank balance:"+finalBalance);

	 }

}

package com.bridgelabz.datastructure;

import com.bridgelabz.dataMethods.QueueUsingLinkedListObjectType;
import com.bridgelabz.utility.Utility;

public class CalenderQueue {
	static int n=1,counter=0,space=0;

	public static void main(String[] args) 
	{
		//creating main object for Queue using linkedList class  
		QueueUsingLinkedListObjectType mainqueue= new QueueUsingLinkedListObjectType();
		
		//creating sub  object for Queue using linkedList class to store week days  
		QueueUsingLinkedListObjectType qll= new QueueUsingLinkedListObjectType();
		
				//input valid month
				System.out.println("Enter a month between 1 to 12");
				int month = Utility.getInt();
				
				//input valid year
				System.out.println("Enter the year which is valid ");
				int year =  Utility.getInt();
				
				//input valid date
				System.out.println("Enter the date between 1 to 31");
				int date =  Utility.getInt();

		
		//method to find DAY---for which the inputs are given By USEr
		int count= Utility.day(date,month,year);
		
		//Days of week a ARRAY is Char created 
		char c[]= {'s','m','t','w','t','f','s'};
		
		
			//display the DAYS 
			for(int i=0;i<c.length;i++)
			{
				System.out.print(c[i]+"\t");
			}
		
		
		System.out.println("\n");

		int[] days = { 30, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		// condition for checking year is a leap year are not
		if( year%4==0 && year%100!= 0   ||   year%400==0)
		{
			days[1] = 29;
		}
		
		/*this for is to store days to sub queues and storing sub queues in main queue*/
		for (int i = 1; i <= days[month-1]; i++) 
		{  
			qll.insertAtEnd(i);//calling insert method to insert elements in SUBQUEUE
			
				//condition to create new sub queue
				if ((i + count) % 7 == 0 || i==days[month-1] ) 
				{
					mainqueue.insertAtEnd(qll);// inserting subqueue to main queue 
					
					qll=new QueueUsingLinkedListObjectType(); // creating new sub queue
	            }
		}
		
		/*for to print space where there is no day falls*/
		for (int i=0;i<count;i++)
		{
			System.out.print("\t");
		}
		
		/*for loop to print all subqueues in main queue*/
		for (int i=0 ;i<mainqueue.size();i++)
		{
			//removing top queue from main queue and coping it to variable
			QueueUsingLinkedListObjectType week=(QueueUsingLinkedListObjectType) mainqueue.pop();
			
				//for loop to print elements in sub queue
				for (int j=0;j<week.size();j++)
				{
					//printing sub object elements
					System.out.print(week.pop()+"\t");
				}
				System.out.println();
				//System.out.println((Object)mainqueue.pop());
			
		}
	}

}
	



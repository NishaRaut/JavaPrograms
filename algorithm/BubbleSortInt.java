package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

/**
 * @author admin1
 *
 */
public class BubbleSortInt {

	public static void main(String[] args) 
	{
		System.out.println("Input number of integers to sort");
	    int n = Utility.getInt();
	    
	    System.out.println("Enter the "+n+" integer numbers:");
	     int arr[]=new int[n];
	  for(int i=0;i<arr.length;i++)
	  {
		 arr[i]=Utility.getInt();
	  }
	  
	  int[] sortIt = new int[n];
	  sortIt = Utility.bubbleSort(arr);
	  System.out.println("sorted numbers are:");
	 
	  for(int i=0;i<sortIt.length;i++) {
		  System.out.println(sortIt[i]);
	  }
	  

	}
	

}

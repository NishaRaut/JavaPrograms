package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class Prime2D {
	public static void main(String[] args) {
		System.out.println("Enter range");
		int range = Utility.getInt();
		
		String prime[][] = Utility.primeNumbersInA2DArray(range);
		
		for(int i=0; i<prime.length; i++)
		{
			for(int j=0; j<prime[0].length; j++)
			{
				if(prime[i][j] != null)
					System.out.print(prime[i][j]+"  ");
			}
			System.out.println();
			System.out.println();
       }
}
}



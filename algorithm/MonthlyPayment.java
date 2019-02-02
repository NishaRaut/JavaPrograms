package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			double P = Double.parseDouble(args[0]);
			double Y = Double.parseDouble(args[1]);
			double R = Double.parseDouble(args[2]);
			double Payment = Utility.monthlyPayment(P, Y, R);
			System.out.println("\nMonthly Payment:"+Payment);
		}


	}

}

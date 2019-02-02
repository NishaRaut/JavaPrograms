package com.bridgelabz.datastructure;

//import com.bridgelabz.dataMethods.Stack;

import com.bridgelabz.utility.Utility;

public class BalancedParanthesis {
	public static void main(String[] args)
	{
		System.out.println("Enter expression");
		//Stack<String> stk=new Stack<String>(10);
		   String expression = Utility.nextLine();
			boolean balance = Utility.isBalancedParentheses(expression);
			if(balance == true)
				System.out.println("String is Balanced");
			else
	System.out.println("String is not Balanced");
	}

}

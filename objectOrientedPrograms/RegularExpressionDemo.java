package com.bridgelabz.objectOrientedPrograms;

import com.bridgelabz.utility.Utility;

public class RegularExpressionDemo {
	public static void main(String[] args) {

		System.out.println("Enter the name:");
	  	String name=Utility.nextLine();
	  	
	  	System.out.println("Enter fullName");
	  	String surname=Utility.nextLine();
	  	String fullname=surname.substring(0, surname.length());
	  	
	  	System.out.println("Enter Contact Number");
	  	String contactNo=Utility.nextLine();
	  	
	  	System.out.println("Enter Date");
	  	String date=Utility.nextLine();
		
		Utility.regularExpression(name,fullname,contactNo,date);
			

	}

}

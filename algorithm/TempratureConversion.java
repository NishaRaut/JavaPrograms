package com.bridgelabz.algorithm;
import java.util.Scanner;


import com.bridgelabz.utility.Utility;
public class TempratureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Convert celsius to fahrenheit");
		System.out.println("Convert fahrenheit to celsius");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the tempreture in celsius:");
	        double celToFar=sc.nextDouble();
	        double faranheit=Utility.CelsiouToFahrenheit(celToFar);
	        System.out.println("tempreture in fahrenheit:"+faranheit);
	        break;
	        
	        
		case 2:
			System.out.println("Enter the tempreture in fahrenheit:");
	        double farToCel=sc.nextDouble();
	        double celsius=Utility.CelsiouToFahrenheit( farToCel);
	        System.out.println("tempreture in Celsius:"+celsius);
	        break;
	        
		}

	}

}

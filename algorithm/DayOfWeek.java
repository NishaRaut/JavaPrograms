package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		int day=Integer.parseInt(args[2]);
		String[] days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int d=Utility.dayOfWeek(day, month, year);
		System.out.println("Day number is:"+d);
		String weekday = days[d];
		System.out.println("Date:"+day+"."+month+"."+year);
        System.out.println("\nDay:"+weekday);

	}

}

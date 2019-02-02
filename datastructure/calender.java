package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class calender {
	
  public static void main(String[] args) 
  {
			 
int month = Integer.parseInt(args[0]);
int year = Integer.parseInt(args[1]);
//	  System.out.println("enter month:");
//      int month=Utility.getInt();
//      
//      System.out.println("enter year:");
//      int year=Utility.getInt();
//             
             
      int dayOfWeek = Utility.dayOfWeek(month, 1, year);
      String months[] = {"","January","Feburary","March","April","May","June","July","August","September","October","November","December"};
      
      int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
      String weekDays[] = {"","Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
      
       if((month == 2) && (Utility.isLeapYear(year)))
	  days[month] = 29;

       System.out.println(months[month]+"  "+year);
       System.out.println();
       for(int i=1; i<weekDays.length; i++)
       {
	   System.out.print(weekDays[i]+" ");
        }
       System.out.println();
       for(int i=0; i<dayOfWeek; i++) 
       {
	   System.out.print("    ");
      }
      for(int i=1; i<=days[month];i++) 
      {
	  if(i<10)
		  System.out.print(i+"   ");
	  else
		  System.out.print(i+"  ");
	   if((i+dayOfWeek) % 7 == 0 || i == days[month])
		System.out.println();
        }
	}
}
	

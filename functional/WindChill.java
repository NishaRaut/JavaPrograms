package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		double res=Utility.windChill(t,v);
  System.out.println(" wind chill tempreture: "+res);
	}

}

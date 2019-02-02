package com.bridgelabz.datastructure;

import java.io.FileReader;

import java.io.IOException;
import java.util.Collections;

import com.bridgelabz.utility.Utility;

public class OrderdLIst {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
			FileReader file = null ;
	  		String no=" ";

	  		System.out.println("File array:");  
	  	     
	  		try
	  		{	file= new FileReader("orderd.txt");
	  			
	  			int j;
	  			while((j=file.read())!=-1)
	  			 {   
	  				 System.out.print((char)j);
	  				 no=no+(char)j;
	  			 }
	  		} 
	  		catch (IOException e)
	  		{
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	  		finally
	  		{
	  	     file.close();  
	  		}
	  		
	  		System.out.println("\nEnter any number for checking : ");
			String word = Utility.getString();
	       Utility.orderedList(word,no);
	  
	}

}

package com.bridgelabz.datastructure;

import java.io.FileReader;
import java.io.IOException;
import com.bridgelabz.utility.Utility;

public class UnorderdList {

	public static void main(String[] args) throws IOException 
	{ 
		FileReader file = null ;
  		String s="";

  		System.out.println("File array:");  
  	     
  		try
  		{	file= new FileReader("unorder.txt");
  			
  			int j;
  			while((j=file.read())!=-1)
  			 {   
  				 System.out.print((char)j);
  				 s=s+(char)j;
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
		System.out.println("\nEnter any word for checking : ");
		String word = Utility.getString();
       Utility.unorderedList(word,s);
		
}
}
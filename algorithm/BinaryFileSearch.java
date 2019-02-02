 package com.bridgelabz.algorithm;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class BinaryFileSearch 
{
public static void main(String[] args) throws IOException 
{ 
	FileReader file = null ;
	String s="";
	String str[];// = new String[7];
	//String word = in.next();

	System.out.println("File array");  
     
	try
	{	file= new FileReader("bin.txt");
		
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

	str = s.split(" ");
	Utility.bubbleSortOfString(str);
	System.out.println("\nSorted array");

	for(int i=0; i<str.length; i++) 
	{
		System.out.print(str[i]+" ");
	}
	System.out.println();
	/*
	System.out.println("\n\nEnter searched word");
	//String search = in.next();
	int index = utility.binarySearchForString(str, search);
	if(index == -1) {
		System.out.println("Word is not found");
	}
	System.out.println("\nPosition of the word:"+(index+1));
	in.close();*/
}
}
	
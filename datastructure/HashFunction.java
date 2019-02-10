package com.bridgelabz.datastructure;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class HashFunction {
	
	public static void main(String[] args) throws Exception {
		System.out.println("hello");
	
		String text="/home/admin1/eclipse-workspace/nisha/bridgelabz/orderd.txt";
		BufferedReader fileReader=new BufferedReader(new FileReader(text));
		String line=" ";
		String[] str=null;
		//Reading from a file
		while((line=fileReader.readLine())!=null)
			{
				str=line.split(" ");
			}
			Integer[] arr=new Integer[str.length];
			System.out.print("List in File : ");
			//Storing into a integer array
			for(int i=0;i<str.length;i++) {
				System.out.print(str[i]+" ");
				arr[i]=Integer.parseInt(str[i]);
			}
			System.out.println();
			
			
			 // Creates an empty HashMap 
			 List<List<Integer>> arraylist = new ArrayList<List<Integer>>();  
			 for(int i=0;i<11;i++) {
				 arraylist.add(new ArrayList<Integer>());
			}
			
			// Traverse through the given array 
		        for (int i = 0; i < arr.length; i++) { 
		        	// Get if the element is present 
		            Integer c = Utility.hashFunction(arr[i]);
		         
		            // Insert the element 
		            arraylist.get(c).add(arr[i]);
		        }
		        for(List<Integer> l:arraylist) {
		        	if(!l.isEmpty()) {
		        		//filewritter.write(l.print());
		        	System.out.println(l);
		        	}
		        }
		        System.out.println("Enter the string to search : ");
				Integer key=Utility.getInt();
				int c =Utility.hashFunction(key);
				boolean s=arraylist.get(c).contains(key);
				System.out.println(s);
		        if(s) {
		        	 arraylist.stream().filter(list-> list.contains(key)).findFirst().get().remove(key);
		        }else {
		        	// Insert the element 
		            arraylist.get(c).add(key);
		        }
		        BufferedWriter filewritter=new BufferedWriter(new FileWriter(text));
		        arraylist.stream().forEach(list-> list.forEach(t -> {
					try {
						filewritter.write(t.intValue()+" ");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}) );
		                
       
		
		filewritter.close();
		fileReader.close();
	}


}

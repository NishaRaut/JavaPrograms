package com.bridgelabz.objectOrientedPrograms;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJSONFile {
	public static void main(String[] args)
	{
	JSONObject obj=new JSONObject();
    obj.put("key","value");
    obj.put("key1","value1");
    obj.put("key2","value2");
    //obj.put("key3","value3");
    
//    JSONArray list=new JSONArray();
//    list.add("java");
//    list.add("jsp");
//    list.add("servlet");
//    
//    obj.put("cources", list);
//    
           try(FileWriter file=new FileWriter("myJSON.json"))
    		{
    			file.write(obj.toString());
    			file.flush();
    		}
           catch(IOException e)
           {
        	   e.printStackTrace();
           }
       System.out.println(obj);
	}
}

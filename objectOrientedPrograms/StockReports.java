package com.bridgelabz.objectOrientedPrograms;

import java.io.File;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockReports {
	public static void main(String[] args) throws Exception {

		JSONParser parse = new JSONParser();// convert json file into java o
File file=new File("/home/admin1/eclipse-workspace/nisha/bridgelabz/src/com/bridgelabz/objectOrientedPrograms/stock.json");
		// JSON parser object to parse read file
		JSONObject object = (JSONObject) parse.parse(new FileReader(file));
		//System.out.println(object);
		
		JSONObject obj1 = (JSONObject) object.get("stock1");
		//System.out.println("\n************** Amazon stock ********************\n");
		//System.out.println(obj1);
		int amazonNumberOfShares = Integer.parseInt(obj1.get("Number of shares").toString());
		int amazonSharesPrice = Integer.parseInt(obj1.get("shares price").toString());
		int totalOfAmazonShares = amazonNumberOfShares * amazonSharesPrice;
		//System.out.println("Total amount of shares of AMAZON is:" + totalOfAmazonShares);

		JSONObject obj2 = (JSONObject) object.get("stock2");
		//System.out.println("\n************** flipkart stock ********************\n");
		//System.err.println(obj2);
		int flipcartNumberOfShares = Integer.parseInt(obj2.get("Number of shares").toString());
		int flipcartSharesPrice = Integer.parseInt(obj2.get("shares price").toString());
		int totalOfFlipkartShares = flipcartNumberOfShares * flipcartSharesPrice;
		//System.out.println("Total amount of shares OF FLIPKART is:" + totalOfFlipkartShares);

		JSONObject obj3 = (JSONObject) object.get("stock3");// obj store sub-obj contains in main key
		//System.out.println("\n************** bigbazar stock ********************\n");
		//System.err.println(obj3);
		int bigbazarNumberOfShares = Integer.parseInt(obj3.get("Number of shares").toString());
		int bigbazarSharesPrice = Integer.parseInt(obj3.get("shares price").toString());
		int totalOfbigbazarShares = bigbazarNumberOfShares * bigbazarSharesPrice;
		//System.out.println("Total amount of shares BIGBAZAR is:" + totalOfbigbazarShares);

		JSONObject obj4 = (JSONObject) object.get("stock4");// obj store sub-obj contains in main key
		//System.out.println("\n************** myntra stock ********************\n");
		//System.err.println(obj4);
		int myntraNumberOfShares = Integer.parseInt(obj4.get("Number of shares").toString());
		int myntraSharesPrice = Integer.parseInt(obj4.get("shares price").toString());
		int myntraShares = myntraNumberOfShares * myntraSharesPrice;
		//System.out.println("Total amount of shares MYNTRA is:" + myntraShares);
		
		System.out.println(" StockName: " + " NumberOfShares: "+" SharesPrice: "+ " TotalShares: ");
		System.out.println("  Amazon  " +"      "+amazonNumberOfShares+"             "+ amazonSharesPrice+"         " + totalOfAmazonShares  );
		System.out.println("  flipkart " +"     "+flipcartNumberOfShares +"             "+ flipcartSharesPrice +"         "+totalOfFlipkartShares);
		System.out.println("Stock name"+"      "+bigbazarNumberOfShares +"             "+ bigbazarSharesPrice+"         "+ totalOfbigbazarShares );
		System.out.println("Stock name"+"      "+ myntraNumberOfShares +"             "+ myntraSharesPrice +"         "+ myntraShares );
		

	}
}
package com.bridgelabz.objectOrientedPrograms;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryManagement {
	public static void main(String[] args)throws Exception {
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(new FileReader("/home/admin1/eclipse-workspace/nisha/bridgelabz/src/com/bridgelabz/objectOrientedPrograms/InventoryData.json"));
		System.out.println(obj);

		JSONObject obj1 = (JSONObject) obj.get("Rice");
		System.out.println("\n############ RICE ###############");
		System.out.println(obj1);
		int priceRice = Integer.parseInt(obj1.get("price").toString());
		int weightRice = Integer.parseInt(obj1.get("weight").toString());
		int totalPriseRice = priceRice * weightRice;
		System.out.println("Total Prise of rice:" + totalPriseRice);

		JSONObject obj2 = (JSONObject) obj.get("pulse");
		System.out.println("\n############ PULSE ###############");
		System.out.println(obj2);
		int pricePulse = Integer.parseInt(obj2.get("price").toString());
		int weightPulse = Integer.parseInt(obj2.get("weight").toString());
		int totalPrisePulse = pricePulse * weightPulse;
		System.out.println("Total Prise of pulse:" + totalPrisePulse);

		JSONObject obj3 = (JSONObject) obj.get("wheats");
		System.out.println("\n############ WHEATS ###############");
		System.out.println(obj3);
		int priceWheat = Integer.parseInt(obj3.get("price").toString());
		int weightWheat = Integer.parseInt(obj3.get("weight").toString());
		int totalPriseWheat = priceWheat * weightWheat;
		System.out.println("Total Prise of wheats:" + totalPriseWheat);
	}
}

package com.bridgelabz.objectOrientedPrograms;

import java.io.Serializable;

public class Stock implements Serializable
{

	//{"stockname":"marketstock","numbers of share":201,"price":500}, 
	private String stockname;
	private int numbersOfShares;
	private int price;
	
	public String getStockname()
	{
		return stockname;
	}
	public void setStockname(String stockname) 
	{
		this.stockname = stockname;
	}
	public int getNumbersOfShares() 
	{
		return numbersOfShares;
	}
	public void setNumbersOfShares(int numbersOfShares) 
	{
		this.numbersOfShares = numbersOfShares;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stock [stockname=" + stockname + ", numbersOfShares=" + numbersOfShares + ", price=" + price + "]";
	}
	
	

}

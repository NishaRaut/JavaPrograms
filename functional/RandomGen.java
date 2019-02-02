package com.bridgelabz.functional;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGen {
	
	public static int RandomMethod(int min,int max)
	{
		int random=0;
		while(true)
		{
			int randNo=ThreadLocalRandom.current().nextInt(); 
			if(randNo>=50 && randNo<=100)
			{
				random=randNo;
				//random=random+randNo;
				break;
			}
		}
		return random;
	}
	public static void main(String[] args)
	{
		int ran=RandomMethod(50,100);
		System.out.println("random no between 50 to 100 is:"+ran);
	
	}

}

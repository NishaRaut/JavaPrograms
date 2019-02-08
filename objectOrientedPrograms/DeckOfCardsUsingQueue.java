package com.bridgelabz.objectOrientedPrograms;

import com.bridgelabz.dataMethods.QueueUsingLinkedList;
import com.bridgelabz.utility.Utility;

public class DeckOfCardsUsingQueue {
	/**This method generate deck of cards and stored it in perticular arra 
	* @return array in which cards are stored
	*/
	public String[] assignCards()
	{
		String[] card = {"Clubs","Diamonds", "Hearts", "Spades"};
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
		String[] deckOfCards = new String[52];
		//Random random = new Random();
		
		int index=0;
		for(int i=0 ; i<card.length;i++)
		{
			for(int j=0;j<rank.length;j++)
			{
				deckOfCards[index++]=rank[j]+" "+card[i];
			}
		}
		System.out.println("\n********Before shuffle******** ");
		for(int i=0;i<deckOfCards.length;i++)
		{
			System.out.print(deckOfCards[i]+ "  ");
		}
		return deckOfCards;
	}
	
		/**This method shuffle the cards using random function
		* @param deckOfCards : cards to be shuffle
		* @return shuffle cards
		*/
		public String[] shuffleCards(String[] deckOfCards)
		{
			//shuffling of cards
			for(int i = 0;i<deckOfCards.length;i++)
			{
				int random = (int)(Math.random()*52);  //shuffling using random function
				String temp = deckOfCards[i];
				deckOfCards[i] = deckOfCards[random];
				deckOfCards[random] = temp;
			}
			System.out.println("\n******After shuffle********");
			for(int i=0;i<deckOfCards.length;i++)
			{
				System.out.print(deckOfCards[i]+"  ");
			}
			return deckOfCards;
		}
		
	/**This method distribute shuffled cards in 4 player
	* @param deckOfCards shuffle cards to be distributed
	* @param noOfPlayers : total player in which cards in to be distributed 
	* @param noOfCards : total cards to be distributed in played
	* @return cards to be distributed
	*/
	public String[][] distributedCards(String[] deckOfCards, int noOfPlayers , int noOfCards)
	{
		System.out.println("Now Distributing 9 cards \n");
		int count = 0;
		String[][] distributedCards = new String[noOfPlayers][noOfCards];
		for(int i=0; i < noOfPlayers;i++)
		{
			for(int j=0;j<noOfCards;j++)
			{
				distributedCards[i][j] = deckOfCards[count++];
			}
		}
		int cnt=1;
		for(int i=0; i < noOfPlayers;i++)
		{
			System.out.print("Player "+cnt+"  :  ");
			for(int j=0;j<noOfCards;j++)
			{
				System.out.print(distributedCards[i][j]+"  ");
			}
			cnt++;
			System.out.println("\n");
		}
		return distributedCards;
	}

	/*****************************Deck of cards Queue******************************/
	
	QueueUsingLinkedList queue = new QueueUsingLinkedList();
	/**This method copy cards stored in 2d array to 1d array to sort by rank
	* @param distributedShuffle is distributed cards in players
	* @param noOfPlayer is no of players 
	* @param noOfCards is total cards to distribute in players
	*/
	public void deckOfCardsQueue(String[][] distributedShuffle, int noOfPlayer, int noOfCards) 
	{
		String[] cards = new String[noOfCards];
		for(int i= 0;i<noOfPlayer;i++)
		{
			for(int j=0;j<noOfCards;j++)
			{
				cards[j] = distributedShuffle[i][j];   // copying in 1D array
			}
			queue.enqueue("\nPlayer "+(i+1)+" Cards");
			sortCards(cards);
		}
		//queue.show();   //Printing sorted cards
	}
	
	/**This method sort the cards by rank
	* @param cards are players cards
	*/
	public  void sortCards(String[] cards)
	{
		char[] numberRank = {'A','2','3','4','5','6','7','8','9','0','J','Q','K'};
		for(int i = 0 ; i < numberRank.length;i++)
		{
			for(int j = 0 ; j < cards.length ; j++)
			{
				String card = cards[j];    
				char cardRank = card.charAt(0);   //For checking first element in cards array
				if(cardRank == numberRank[i]) 
				{
					queue.enqueue(card);  //add sorted card in queue
				}
			}
		}
	}



////  Main ***************

public static void main(String[] args) 
	{
		Utility utility = new Utility();
		int noOfPlayer = 4;
		int noOfCards = 9;
		String[] init = utility.assignCards();
		String[] shuffleCards = utility.shuffleCards(init);
		String[][] distributedShuffle = utility.distributedCards(shuffleCards, noOfPlayer, noOfCards);
		System.out.println("Players Cards After Sorting ");		
		utility.deckOfCardsQueue(distributedShuffle, noOfPlayer, noOfCards);
	}
}

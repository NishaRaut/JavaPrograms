package com.bridgelabz.objectOrientedPrograms;

public class DeckOfCards {
	public static void main(String[] args) {

		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int n = suits.length * ranks.length;// n=52
		String[] deck = new String[n];
		for (int i = 0; i < ranks.length; i++) // 13
		{
			for (int j = 0; j < suits.length; j++) // 4
			{
				deck[suits.length * i + j] = ranks[i] + " of " + suits[j];// 13*4=52 cards generated
			}
		}
		// Suffle cards
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		// Distributes 36 cards between 4 person
		for (int i = 1; i <= 4; i++) // 4 player
		{
			System.out.println("\nPlayer number: " + (i) + " have cards are below ");
			for (int j = 0; j < 9; j++) // 9 player
			{
				System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");// here 36 cards generated
				
			}
		}
	}
}

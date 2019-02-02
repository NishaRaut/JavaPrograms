package com.bridgelabz.datastructure;

import com.bridgelabz.dataMethods.StackUsingLinkedList;
import com.bridgelabz.utility.Utility;

public class AnagramPrimeNumberUsingStackLinkedList {
	/**
	 * Purpose: The Prime Numbers that are Anagram in a Stack using the Linked List.
	 * 
	 * @author nisha raut
	 * @version 1.0
	 * @since   02.01.2019
	 */

		public static void main(String[] args) {
			System.out.println("Enter the range of the prime number");
			int number = Utility.getInt();
			StackUsingLinkedList<String> anagramPrimeNumber = Utility.anagramPrimeNumbersUsingStackLinkedList(number);
			int size = anagramPrimeNumber.size();
			for(int i=1; i<=size; i++) {
				System.out.println(anagramPrimeNumber.pop());
			}
		}
	}


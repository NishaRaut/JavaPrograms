package com.bridgelabz.utility;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.dataMethods.Dequeue;
import com.bridgelabz.dataMethods.Queue;
import com.bridgelabz.dataMethods.QueueUsingLinkedList;
import com.bridgelabz.dataMethods.Stack;
import com.bridgelabz.dataMethods.StackUsingLinkedList;
import com.bridgelabz.dataMethods.singleLinkedList;

public class Utility {
	static Scanner sc = new Scanner(System.in);

	/*
	 * Aim: User Input and Replace String Template “Hello <<UserName>>, How are
	 * you?”
	 */
	public void replaceString() {
		String str1, str2, str3;

		str1 = "Hello nisha how are you?";

		// Getting the input string or sentence from user
		System.out.println("Enter the new name which you want to replace with nisha:");
		str2 = sc.nextLine();
		// replace existing word with new word using inbuilt function replace().
		str3 = str1.replace("nisha", str2);
		System.out.println("New string:" + str3);

	}

	/*
	 * Aim: Flip Coin and print percentage of Heads and Tails
	 */
	public void flipCoin() {
		Scanner sc = new Scanner(System.in);
		double head = 0, tail = 0;
		// taking input from user that how many times you want to flip the coin
		System.out.println("Enter the number you have to flip the coin:");
		int no = sc.nextInt();

		for (int i = 0; i < no; i++) { /*
										 * Random() function used to find out the random values between given numbers
										 * (Ex. 0 to 1 =0.094....,0.713... etc) if value less than 0.5 then it will
										 * consider as head otherwise tell
										 */

			if (Math.random() < 0.5) {
				head++;// increment head.
			} else {
				tail++;// increment tail.
			}
		}
		// calculate the percentage of possibility of head and store it in headper
		// variable.
		double headper = (head / no) * 100;
		// calculate the percentage of possibility of head and store it in tailper
		// variable.
		double tailper = (tail / no) * 100;
		System.out.println("number of head " + head + " with head percentage" + headper + "%");
		System.out.println("number of tail " + tail + " with tail percentage is " + tailper + "%");
	}

	/*
	 * Aim: Leap Year. A leap year is a year which has 366 days. The extra day is
	 * the 29th February. There is a leap year every four years.
	 */
	public void leapyr() {
		Scanner sc = new Scanner(System.in);
		// taking user input i.e year.
		System.out.println("Enter the year:");
		int no = sc.nextInt();
		// use condition to confirm that input must have four digits.convert year no
		// into string and find out the length.
		if (Integer.toString(no).length() == 4) {
			// if no(year) is divisible by 4 and 400 but not divisible by 100 then it is
			// only leap year.
			if (no % 400 == 0 || no % 4 == 0 && no % 100 != 0) {
				System.out.println("It is leap year");
			} else {
				System.out.println("It is not aleap year");
			}

		}
	}

	/*
	 * Aim: Power of 2
	 */
	public static void powersquare() {
		Scanner sc = new Scanner(System.in);
		// taking the input from user.
		System.out.println("Enter the number:");
		int no = sc.nextInt();
		/*
		 * from zero to n numbers we will use as power of 2 and print the table.
		 * condition is that the n number is less than 31.
		 */
		if (no >= 0 && no < 31) {
			/*
			 * we using variable p to store the power of number. initially it will be 1
			 * because we have to multiply it while finding the power
			 */
			double p = 1;
			// first loop for numbers who we use as power of 2.
			for (int i = 0; i < no; i++) { // second loop to find out the power numbers 0 to user input.
				for (int j = 0; j < i; j++) { // we use Math.pow() function to find the power of each value.
					p = Math.pow(2, i);
				}
				// condition is satisfy the it will print
				System.out.println("power of 2^" + i + "is:" + p);
			}
		} else { // condition is not satisfy then it will exicute else part.
			System.out.println("Enter the number only less than 31");
		}
	}
	/*
	 * Aim:harmonic number In mathematics, the n-th harmonic number is the sum of
	 * the reciprocals of the first n natural numbers:
	 * 
	 */

	public void harmonicNum() {

		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter the n'th number:");
			int no = sc.nextInt();
			// to insure that the number is not zero
			if (no != 0) { // taking new variable add to find out harmonic number.
				double add = 0;
				// loop for add 1/1 to 1/n numbers.
				for (int i = 1; i <= no; i++) {
					add = add + (1 / i);
				}
				// to return a final harmonic value.
				System.out.println("The harmonic value is:" + add);
			}
		}

	}

	/* Aim: Computes the prime factorization of N using brute force. */
	public void primeFact() {
		Scanner sc = new Scanner(System.in);
		{ // to taking user input
			System.out.println("Enter the number:");
			int no = sc.nextInt();
			System.out.println("prime factors of number are:");
			// loop to repeatedly print the factors()
			for (int i = 2; i * i <= no; i++) {
				while (no % i == 0) {

					System.out.println(i + " ");
					no = no / i;
				}
			}

		}
	}

	/* 7.gambler */
	public static void gamb() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the stake ammount:");
		int stake = sc.nextInt();

		System.out.println("Enter the goal:");
		int goal = sc.nextInt();

		System.out.println("Enter the trail:");
		int trial = sc.nextInt();

		int win = 0, bet = 0;

		for (int i = 1; i <= trial; i++) {

			int cash = stake;
			// where cash is not zero and less than the target game will continue.
			while (cash > 0 && cash < goal) {
				bet++;
				// generate random number to decide randomly whether the player win or loss
				if (Math.random() < 0.5) {
					cash++;
				} else {
					cash--;
				}
				// cash is increment equal to target then player will win the game.
				if (cash == goal)
					win++;
			}

		}
		System.out.println(win + " of " + trial);
		// calculate the winning percentage.
		System.out.println("the win percentage is " + 100.0 * win / trial);
		// calculate the average.
		System.out.println("average bet " + 1.0 * bet / trial);

	}

	/* 8.ARRAY */
	public static void arrayPro() {
		Scanner sc = new Scanner(System.in);

		// taking input from user how many column and rows will be there.
		System.out.println("Enter the rows and columns:");
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		// use 2D array two store rows and column
		int arr[][] = new int[rows][cols];
		System.out.println("Enter the values to perticular position for 2D array: ");

		// first loop for rows
		for (int i = 0; i < rows; i++) {
			// second loop for columns
			for (int j = 0; j < cols; j++) {
				// to print the row and column with index
				System.out.print("arr[" + i + "][" + j + "]=");
				arr[i][j] = sc.nextInt();

			}
		}
		System.out.println("2D array is:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// to print the 2D array
				System.out.print(arr[i][j] + " ");
			}
			// for next line
			System.out.println();
		}

	}

	/* 9.TRIPPLET */
	public void tripplet() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		System.out.println("Enter the numbers:");
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; j < n; j++) {
					if (a[i] + a[j] + a[k] == 0) {
						count++;
						System.out.println("triplet are: " + a[i] + "," + a[j] + "," + a[k]);
					}
				}
			}
		}
		// System.out.println("triplet not found");
	}
	/*
	 * Aim: Write a program Distance.java that takes two integer command­line
	 * arguments x and y and prints the Euclidean distance from the point (x, y) to
	 * the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). Use
	 * Math.power function
	 */

	public void distance() {
		Scanner sc = new Scanner(System.in);
		// co-ordinates for first point is(0,0)
		int x1 = 0, y1 = 0;
		System.out.println("Enter the two points:");
		// taking co-ordinates for the second point from user
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		// adding their sqare to find out there distance.
		int sq = (x1 * y1) + (x2 + y2);
		System.out.println("Distance is:" + Math.sqrt(sq));
	}

	/* 11.stopwatch */
	public static void stopwatchTime() {
		Scanner sc = new Scanner(System.in);

		long start = 0, stop = 0;
		boolean a = true;
		boolean option = true;
		while (option == true) {

			System.out.println("press 1 to start the stopwatch: press 2 to stop the watch :");
			int tab = sc.nextInt();
			if (tab == 1) {
				// java.time.Instant.getEpochSecond() method gets the number of seconds from the
				// Java epoch of 1970-01-01T00:00:00Z.
				start = Instant.now().getEpochSecond();
				a = false;

			} else if (tab == 2 && a == false) {
				stop = Instant.now().getEpochSecond();
				long resTime = stop - start;
				System.out.println("Elapsed time:" + resTime + " seconds");
				option = false;
				break;
			} else {
				System.out.println("Invalid input press one or 2 only");
				break;
			}
		}
	}

	/* coupen */
	public static void coupons() {
		Scanner sc = new Scanner(System.in);
		int count = 0, j = 0, size = 0;
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		while (size < n) {
			int random = (int) (Math.random() * n);
			count = 0;

			for (int i = 0; i < arr.length; i++) {

				if (arr[i] == random || random < 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				arr[j++] = random;
				size++;
			}
		}

		for (var i = 0; i < arr.length; i++) {
			System.out.println("Coupen numbers are:" + arr[i]);
		}
	}

	/*
	 * 15.Write a program Quadratic.java to find the roots of the equation a*x*x +
	 * b*x + c. Since the equation is x*x, hence there are 2 roots.
	 */
	public static void quadratic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a:");
		double a = sc.nextDouble();
		System.out.println("Enter the value for b:");
		double b = sc.nextDouble();
		System.out.println("Enter the value for c:");
		double c = sc.nextDouble();

		double root1 = 0, root2 = 0;
		double delta = ((b * b) - (4 * a * c));
		System.out.println("delta=" + delta);
		if (delta > 0) {
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Roots of the quadratic equetions are:");
			System.out.println("ROOT1:" + root1);
			System.out.println("ROOT2:" + root2);

		} else if (delta == 0) {
			root1 = (-b / (2 * a));
			System.out.println("Root1 AND Root2 =" + root1);
		} else {
			double realPart = (-b / (2 * a));
			double imaginaryPart = (Math.sqrt(-delta) / (2 * a));
			System.out.println("Root 1 = " + realPart + "+" + imaginaryPart + "i");
			System.out.println("Root 2 = " + realPart + "-" + imaginaryPart + "i");
		}
	}

	/*
	 * Aim: Write a program WindChill.java that takes two double command­line
	 * arguments t and v and prints the wind chill.
	 */
	public static double windChill(double t, double v) {

		double w = 0;
		if ((t <= 50) && (t <= 120 && t >= 3)) {
			w = 35.74 + (0.6215 * t) + (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
		}
		return w;
	}

	/*
	 * aim:12.Write static functions to return all permutation of a String using
	 * iterative method and Recursion method.
	 */
	public static String swap(String s1, int a, int b) {
		char temp;
		char[] arr = s1.toCharArray();
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return String.valueOf(arr);
	}

	public static void permutation(String s1, int first, int last) {
		if (first == last) {
			System.out.println(s1);
		} else {
			for (int i = first; i <= last; i++) {
				swap(s1, first, i);
				permutation(s1, first + 1, last);
				s1 = swap(s1, first, last);
			}
		}

	}

	// TIC TAC TOE
	// method to print the tic tac toe game board
	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println("\n");
		}
		System.out.println();
	}

	public static boolean checkWin(char[][] board) {
		if ((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
				|| (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
				|| (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
				|| (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
				|| (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
				|| (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
				|| (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
				|| (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
				|| (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')) {
			return true;
		}
		return false;
	}

	/****************************
	 * METHODS FOR ALGORITHM
	 ******************************************/

	/*
	 * * purpose: This method is used to get INTEGER from user.
	 */
	public static int getInt() {

		int number = sc.nextInt();
		return number;
	}
	/*
	 * purpose: This method is used to get sentence or word string from user.
	 * 
	 */

	public static String nextLine() {
		// Scanner sc =new Scanner(System.in);
		String inputString = sc.nextLine();
		return inputString;
	}

	/**
	 * @return
	 */
	public static String next() {
		String inputOneWordString = sc.next();
		return inputOneWordString;
	}

	/**
	 * purpose: This method is used to get float from user.
	 * 
	 * @return inputFloat
	 */
	public static float getFloat() {
		float inputFloat = sc.nextFloat();
		return inputFloat;
	}

	/**
	 * purpose: This method is used to get float from user.
	 * 
	 * @return inputDouble.
	 */
	public static double getDouble() {
		double inputDouble = sc.nextDouble();
		return inputDouble;
	}

	/**
	 * purpose: This method is used to get string or word from user.
	 * 
	 * @return string.
	 */
	public static String getString() {
		String string = sc.nextLine();
		return string;
	}

	// Binary method for integer

	/**
	 * @param inputArr
	 * @param search
	 * @return
	 */
	public static int BinaryInt(int[] inputArr, int search) {
		int li = 0;
		int hi = inputArr.length - 1;
		int mid = (li + hi) / 2;
		while (li <= hi) {
			if (search == inputArr[mid]) {
				return mid;
			} else if (search > mid) {
				li = mid + 1;
			} else {
				hi = mid - 1;
			}

		}
		return -1;
	}

	// Binary Search Method for String
	/**
	 * @param search
	 * @param searchedString
	 * @return
	 */
	public static int binarySearchForString(String[] search, String searchedString) {
		int first = 0, last = search.length - 1;
		while (first <= last) {
			int mid = (first + last) / 2;
			if (search[mid].equals(searchedString))
				return mid;
			else if (searchedString.compareTo(search[mid]) > 0)
				first = mid + 1;
			else
				last = mid - 1;
		}
		return -1;
	}

	// **************************************************

	// bubble sort for string
	public static String[] bubbleSortOfString(String sort[]) {
		String temp = null;
		boolean swapped;
		for (int i = 0; i < sort.length; i++) {
			swapped = false;
			for (int j = 0; j < sort.length - i - 1; j++) {
				if (sort[j].compareTo(sort[j + 1]) > 0) {
					temp = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false)
				return sort;
		}
		return sort;
	}
	// insetion sort for integer

	public static int[] insertionSortForInt(int sort[]) {
		int key = sort[0];
		int j;
		for (int i = 1; i < sort.length; i++) {
			key = sort[i];
			j = i - 1;
			while (j >= 0 && sort[j] > key) {
				sort[j + 1] = sort[j];
				j--;
			}
			sort[j + 1] = key;
		}
		return sort;
	}

	// insertion sort for string

	public static String[] insertionSortForString(String string[]) {
		String key;
		int j;
		for (int i = 1; i < string.length; i++) {
			key = string[i];
			j = i - 1;
			while (j >= 0 && string[j].compareTo(key) > 0) {
				string[j + 1] = string[j];
				j--;
			}
			string[j + 1] = key;
		}
		return string;
	}

	public static boolean anagram(char[] s1, char[] s2) {
		// find out the length of string
		int l1 = s1.length;
		int l2 = s1.length;

		if (l1 != l2) {
			return false;
		}
		// Arrays.sort() method is used to sort the array in ascending order.

		Arrays.sort(s1);
		// System.out.println(s1);
		Arrays.sort(s2);
		// System.out.println(s2);
		for (int i = 0; i < l1; i++) {
			// compare two strings are equal or not.
			if (s1[i] != s2[i]) {
				return false;
			}
		}
		return true;
	}

	/*
	 * Aim: Take a range of 0 ­ 1000 Numbers and find the Prime numbers in that
	 * range.
	 */
	public static boolean primeNo(int no) {
		// we are taking one temporary variable.
		int temp = 0;
		for (int j = 2; j < no; j++) { // condition to check number is divisible by other no accept 1 and itself.
			if (no % j == 0) {
				temp = 1;// value of temp will change if condition is true.
			}
		}

		// value of temp will not change if condition of if statement false.
		if (temp == 0) {
			return true;
		}

		return false;
	}

	/*
	 * Aim: Extend the above program to find the prime numbers that are Anagram and
	 * Palindrome
	 */
	public static void primeInRange(int num) {
		for (int i = 2; i <= num; i++) {
			if (primeNo(i)) {
				System.out.println(i + " ");
			}
		}
	}

	public static boolean isPalindrome(int number) {
		int rem = 0, rev = 0;
		int temp = number;
		while (number != 0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}
		if (temp != rev) {
			return false;
		}
		return true;
		/*
		 * int r=0,rev=0; int tempNumber=number; while(number!=0) { r=number%10;
		 * rev=rev*10+r; number=number/10; } if(tempNumber!=rev) return false; return
		 * true;
		 */

	}

	public static boolean isNumberAnagram(int number) {
		if (isPalindrome(number)) // if a number is palindrome then for sure it will be anagram
			return true;
		return false;
	}

	/*
	 * public static void BinarySearch() throws IOException { //open the file for
	 * reading FileReader file = new FileReader("bin.txt"); String searchValue =
	 * "nisha"; int lineSize = 50; int numberOfLines = (file.length() / lineSize);
	 * 
	 * //perform the binary search... byte[] lineBuffer = new byte[lineSize]; int
	 * bottom = 0; int top = numberOfLines;
	 * 
	 * while (bottom <= top) { int middle = (bottom+top)/2;
	 * file.seek(middle*lineSize); // jump to this line in the file
	 * file.read(lineBuffer); // read the line from the file String line = new
	 * String(lineBuffer); // convert the line to a String
	 * 
	 * int comparison = line.compareTo(searchValue); if (comparison == 0) { // found
	 * it break; } else if (comparison < 0) { // line comes before searchValue
	 * bottom = middle + 1; } else { // line comes after searchValue top = middle -
	 * 1; } }
	 * 
	 * }
	 */
	/*
	 * Aim: Reads in strings from standard input and prints them in sorted order.
	 * Uses insertion sort.
	 */
	public static void insertionSort() {

		System.out.println("Enter a String:");
		String s1 = Utility.nextLine();
		String[] sap = s1.split(" ");
		int i, j;
		String key;

		for (j = 1; j < sap.length; j++) { // the condition has changed
			key = sap[j];
			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(sap[i]) > 0) {
					break;
				}
				sap[i + 1] = sap[i];
				i--;
			}

			sap[i + 1] = key;

		}
		System.out.println(Arrays.toString(sap));
	}
	/*
	 * Aim: Reads in integers prints them in sorted order using Bubble Sort
	 * 
	 * public static int bubbleSortInt(int n) { int i, j, temp;
	 * 
	 * int array[] = new int[n];
	 * 
	 * for (i = 0; i < ( n - 1 ); i++) { for (j = 0; j < n - i - 1; j++) { if
	 * (array[j] > array[j+1]) { temp = array[j]; array[j] = array[j+1]; array[j+1]
	 * = temp; } } }
	 * 
	 * return 1; }
	 */
	// bubble sort method for integer

	public static int[] bubbleSort(int[] sort) {
		int temp;
		boolean swapped;
		int size = sort.length;
		for (int i = 0; i < size; i++) {
			swapped = false;
			for (int j = 0; j < size - i - 1; j++) {
				if (sort[j] > sort[j + 1]) {
					temp = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = temp;
					swapped = true;
				}

			}

			if (swapped == false)
				return sort;
		}

		return sort;
	}

	/*
	 * Aim: Write a program with Static Functions to do Merge Sort of list of
	 * Strings.
	 */
	public static void MergeSort(String[] names) {
		if (names.length > 2) {
			String[] left = new String[names.length / 2];
			String[] right = new String[names.length - names.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = names[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = names[i + names.length / 2];
			}
			MergeSort(left);
			MergeSort(right);
			merge(names, left, right);
		}
	}

	public static void merge(String[] names, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = left[a];
				a++;
			} else {
				names[i] = right[b];
				b++;
			}
		}
	}

	/*
	 * Aim: There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
	 * returned by Vending Machine. Write a Program to calculate the minimum number
	 * of Notes as well as the Notes to be returned by the Vending Machine as a
	 * Change
	 */
	public static int fewest(int amount, int sum) {
		int remainder;
		if (amount == 0)
			return sum;
		if (amount >= 1000) {
			remainder = amount / 1000;
			sum = sum + remainder;
			amount = amount % 1000;
			System.out.println("\nNumber of 1000Rs notes:" + remainder);
		} else if (amount >= 500) {
			remainder = amount / 500;
			sum = sum + remainder;
			amount = amount % 500;
			System.out.println("\n Number of 500Rs notes:" + remainder);
		} else if (amount >= 100) {
			remainder = amount / 100;
			sum = sum + remainder;
			amount = amount % 100;
			System.out.println("\n Number of 100Rs notes:" + remainder);
		} else if (amount >= 50) {
			remainder = amount / 50;
			sum = sum + remainder;
			amount = amount % 50;
			System.out.println("\n  Number of 50Rs notes:" + remainder);
		} else if (amount >= 10) {
			remainder = amount / 10;
			sum = sum + remainder;
			amount = amount % 10;
			System.out.println("\n Number of 10Rs notes:" + remainder);
		} else if (amount >= 5) {
			remainder = amount / 5;
			sum = sum + remainder;
			amount = amount % 5;
			System.out.println("\n Number of 5Rs notes:" + remainder);
		} else if (amount >= 2) {
			remainder = amount / 2;
			sum = sum + remainder;
			amount = amount % 2;
			System.out.println("\n Number of 2Rs notes:" + remainder);
		} else {
			remainder = amount / 1;
			sum = sum + remainder;
			amount = amount % 1;
			System.out.println("\n Number of 1Rs notes:" + remainder);
		}
		return fewest(amount, sum);
	}

	/*
	 * Aim: day of the week
	 */
	public static int dayOfWeek(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;

		return d0;
	}
	// Celsius to Fahrenheit:

	public static double CelsiouToFahrenheit(double Celsius) {
		double Fahrenheit = (Celsius * 9 / 5) + 32;
		return Fahrenheit;

	}

	// Fahrenheit To Celsius:
	public static double FahrenheitToCelsius(double Fahrenheit) {
		double Celsius = (Fahrenheit - 32) * 5 / 9;
		return Celsius;
	}

	/*
	 * purpose: By using this method we can calculate the power in double type.
	 * 
	 */
	public static double power(double base, double exponent) {
		double product = 1;
		while (exponent > 0) {
			product = product * base;
			exponent--;
		}
		return product;
	}

	// monthlyPayment
	public static double monthlyPayment(double P, double Y, double R) {
		double n = 12 * Y;
		double r = R / (12 * 100);
		double payment = (P * r) / (1 - (1 / (Utility.power((1 + r), n))));
		return payment;
	}

	// Decimal to Binary conversion
	public static String toBinary(int no) {
		String str = "";
		while (no != 0) {
			int rem = no % 2;
			str = rem + str;
			no = no / 2;
		}
		return str;
	}

	// for create exact 8 digits string or bits
	public static String eightDigit(String str) {
		while (str.length() != 8) {
			str = '0' + str;
		}
		return str;
	}

	// Swap nibbles
	public static String swappedNibble(String str) {
		;
		String eightBit = Utility.eightDigit(str);

		String firstNibble = eightBit.substring(0, 4);
		String secondNibble = eightBit.substring(4, 8);
		String swappedNib = secondNibble + firstNibble;
		System.out.println("After swapping the no. is:");
		System.out.println(swappedNib);

		return swappedNib;

	}
	// to decimal

	public static long toDecimal(String bin) {
		long binary = Long.parseLong(Utility.swappedNibble(bin));
		long decimal = 0;
		long power = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				long tmp = binary % 10;
				decimal += tmp * Math.pow(2, power);
				binary = binary / 10;
				power++;
			}
		}
		return decimal;
	}

	// sqroot
	public static double sqrt(double c) {
		double t = c;
		if (c > 0) {
			double epsilon = 1e-15;
			while (Math.abs(t - c / t) > epsilon * t) {
				t = ((c / t) + t) / 2;
			}
		} else {
			System.out.println("Please enter positive number");
		}
		return t;
	}

	/*
	 * DATA STRUCTURE: Aim:Take an Arithmetic Expression such as
	 * (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the
	 * performance of operations. Ensure parentheses must appear in a balanced
	 * fashion.
	 */

	public static boolean isBalancedParentheses(String expression) {
		int size = expression.length();

		Stack<Character> stack = new Stack<Character>(size);
		char expressionArray[] = expression.toCharArray();
		char ch;

		for (int i = 0; i < expressionArray.length; i++) {

			if (expressionArray[i] == '(' || expressionArray[i] == '{' || expressionArray[i] == '[') {

				stack.push(expressionArray[i]);
			} else if (expressionArray[i] == ')' || expressionArray[i] == '}' || expressionArray[i] == ']') {
				ch = stack.pop();
				switch (ch) {
				case ')':
					if (ch != '(')
						return false;
					break;
				case '}':
					if (ch != '{')
						return false;
					break;
				case ']':
					if (ch != '[')
						return false;
					break;
				default:

				}
			}
		}

		return stack.isEmpty();
	}

	/***********************************************************************************************/
	/**
	 * purpose: create the queue and use all the methods of queue to simulate
	 * banking cash counter
	 * 
	 * @param number
	 * @param queue
	 * @param balance
	 * @return
	 */
	public static double BankingCashCounter(int number, Queue<String> queue, double balance) {

		int choice = 0;
		double amount = 0.0;

		for (int i = 0; i <= number; i++) {
			while (queue.isEmpty() == false) {
				System.out.println("Enter your choice /n 1. Press 1 to deposit /n 2. Press 2 to withdraw\n");
				choice = Utility.getInt();
				if (choice == 1) {
					System.out.println("Enter the amount you want to deposit: ");
					amount = Utility.getInt();
					if (amount < 0) {
						System.out.println("Enter a valid amount:");
					} else {
						balance = balance + amount;
						System.out.println("Available balance:" + balance);
					}
					queue.dequeue();
				}

				else if (choice == 2) {
					System.out.println("Enter the amount you want to withdraw:");
					amount = Utility.getInt();
					if (amount < 0) {
						System.out.println("Enter a valid amount:");
					} else {
						balance = balance - amount;
						System.out.println("Available balance:" + balance);
					}
					queue.dequeue();
				} else {
					System.out.println("Enter the valid choice.");
				}
			}
		}

		return balance;
	}

	/**
	 * purpose: Read .a List of Numbers from a file and arrange it ascending Order
	 * in a Linked List. Take user input for a number, if found then pop the number
	 * out of the list else insert the number in appropriate position
	 * 
	 * @param word
	 * @param s
	 * @throws IOException
	 */
	public static void unorderedList(String word, String s) throws IOException {

		String wordArray[] = s.split(" ");
		singleLinkedList<String> wordList = new singleLinkedList<String>();
		for (int i = 0; i < wordArray.length; i++) {
			wordList.add(wordArray[i]);
			System.out.println(wordArray[i]);
//			System.out.println("///////////////////////////////////////");
//			System.out.println(wordList);
		}
		System.out.println("\nList of string:");
		System.out.println("----------"+word);

		wordList.display();
		
     
		if (wordList.search2(word)) {
			System.out.println("This word is alredy in list position so remove it");
			int index = wordList.getIndex(word);
			wordList.remove(index);
			wordList.display();
			
		} else {
			System.out.println("This word is not in the list so add it");
			wordList.add(word);
			wordList.display();

		}
	}
	/************************************************************************/
	public static void orderedList(String num, String list) throws IOException {
	String noArray[] = list.split(" ");
	singleLinkedList<String> noList = new singleLinkedList<String>();
	for (int i = 0; i < noArray.length; i++) {
		noList.add(noArray[i]);
		}
	System.out.println("sorted list of numbers:");
	//System.out.println("----------"+word);
     
	noList.sort();
	noList.display();
	if (noList.search2(num)) {
		System.out.println("This word is alredy in list position so remove it");
		int index = noList.getIndex(num);
		noList.remove(index);
		noList.display();
		
	} else {
		System.out.println("This word is not in the list so add it");
		noList.add(num);
		noList.display();

	}
}
	

	/*********************************************************************/

	public static boolean palindromeChecker(String word) {
		int size = word.length();
		boolean isPalindrome = true;
		Dequeue<Character> d = new Dequeue<Character>(size);
		char ch[] = word.toCharArray();
		for (int i = 0; i < ch.length; i++)
			d.addRear(ch[i]);
		for (int i = 0; i < ch.length / 2; i++) {
			if (d.removeFront() != d.removeRear()) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

	/************************************************************************************/

	/***************************************************************************
	 * Given the month, day, and year, return which day of the week it falls on
	 * according to the calendar. For month, use 1 for January, 2 for February, and
	 * so forth. Returns 0 for Sunday, 1 for Monday, and so forth.
	 ***************************************************************************/
	public static int day(int month, int day, int year) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		return d;
	}

	// return true if the given year is a leap year
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		if (year % 400 == 0)
			return true;
		return false;
	}

	/****************************************************************************/
	public static String[][] primeNumbersInA2DArray(int range) {
		String[][] prime = new String[range / 100][100];

		System.out.println("prime numbers in a 2D Array");
		System.out.println("---------------------------");
		System.out.println();
		// for printing the range like 0 to 100, 100 to 200 an
		for (int i = 0; i < prime.length; i++) {
			prime[i][0] = Integer.toString(i * 100) + "-" + Integer.toString(i * 100 + 100) + " ";

		}
		int i = 0, j = 0, number = 2;
		while (number < range) {
			if (primeNo(number)) {

				if (number < (i + 1) * 100)
					j++;
				else {
					i++;
					j = 1;
				}
				prime[i][j] = Integer.toString(number);
			}
			number++;
		}
		return prime;
	}

	/**
	 * Purpose: This method is used to print the prime numbers between 1 and
	 * parameter number.
	 * 
	 * @param number user number
	 * @return ArrayList<Integer> Series of prime number
	 */

	public static ArrayList<Integer> prime(int number) {
		ArrayList<Integer> prime = new ArrayList<Integer>();

		// This for loop is starts from 2 and iterate n times
		for (int i = 2; i <= number; i++) {
			int c = 0;

			// This for loop is starts from 2 and iterate half of the value of the first
			// loop
			for (int j = 2; j <= i / 2; j++) {

				/*
				 * If the reminder of the first loop value and the second loop value is 0 then
				 * the value of the c is equal to 1 and break the inner loop
				 */
				if (i % j == 0) {
					c = 1;
					break;
				}
			}

			// if c is equal to 0 its mean the value of i is prime number and print the
			// value of i
			if (c == 0)
				prime.add(i);
		}
		return prime;
	}

	/**
	 * Purpose: This method is used to count the alphabets present in the string and
	 * increment the index of the count array.
	 * 
	 * @param string
	 * @return integer one dimensional array
	 */
	public static int[] count(String string) {

		// Convert String to character array
		char c[] = string.toCharArray();

		// Define a count array and the size of the array is 36
		int count[] = new int[36];

		// using loop 0 to size of the character array
		for (int i = 0; i < c.length; i++) {

			// if character array is small alphabet
			if (c[i] >= 'a' && c[i] <= 'z')

				// small alphabet covert into the integer and increment the count array
				count[c[i] - 97]++;

			// if character array is capital alphabet
			if (c[i] >= 'A' && c[i] <= 'Z')

				// capital alphabet convert into the integer and increment the count array
				count[c[i] - 65]++;

			// if character array is digit between 0 to 9
			if (c[i] >= '0' && c[i] <= '9')

				// digit convert into the integer and increment the count array
				count[c[i] - 22]++;
		}

		// return count array
		return count;
	}

	/**
	 * Purpose: This method is used to check two string is anagram or not
	 * 
	 * @param string1 String
	 * @param string2 String
	 */

	public static boolean isAnagram(String string1, String string2) {

		// compare the length of two strings is equal or not
		if (string1.length() != string2.length())
			return false;

		// call count method and pass first string
		int count1[] = count(string1);

		// call count method and pass second string
		int count2[] = count(string2);

		// check the value of the two strings are equal or not
		for (int i = 0; i < count1.length; i++) {
			if (count1[i] != count2[i])
				return false;
		}
		return true;
	}

	/**
	 * Purpose: To display the anagram prime number by using 2D array.
	 * 
	 * @param number range of the anagram prime number.
	 * @return String two dimensional array of anagram prime number.
	 */

	public static String[][] anagramPrimeNumberIn2DArrays(int number) {
		String string1 = "";
		String string2 = "";
		int count = 0;
		ArrayList<Integer> prime = prime(number);
		int row = prime.size();
		String anagram[][] = new String[row][2];
		System.out.println("\nPrime numbers that are Anagram\n");
		for (int i = 0; i < prime.size(); i++) {
			for (int j = i + 1; j < prime.size(); j++) {
				string1 = Integer.toString(prime.get(i));
				string2 = Integer.toString(prime.get(j));
				if (Utility.isAnagram(string1, string2)) {
					anagram[count][0] = string1;
					anagram[count][1] = string2;
					count++;
				}
			}
		}
		return anagram;
	}

	/**
	 * Purpose: To display the anagram prime number by using Queue LinkedList.
	 * 
	 * @param number range of the anagram prime number.
	 * @return Queue Linked List of anagram prime number.
	 */

	public static QueueUsingLinkedList<String> anagramPrimeNumbersUsingQueueLinkedList(int number) {
		QueueUsingLinkedList<String> queueLinkedList = new QueueUsingLinkedList<String>();
		String string1 = "";
		String string2 = "";

		ArrayList<Integer> prime = prime(number);
		System.out.println("\nPrime numbers that are Anagram\n");
		for (int i = 0; i < prime.size(); i++) {
			for (int j = i + 1; j < prime.size(); j++) {
				string1 = Integer.toString(prime.get(i));
				string2 = Integer.toString(prime.get(j));
				if (Utility.isAnagram(string1, string2)) {
					queueLinkedList.enqueue(string1 + " " + string2);
				}

			}
		}
		return queueLinkedList;
	}

	/**
	 * Purpose: To display the anagram prime number by using Stack LinkedList.
	 * 
	 * @param number range of the anagram prime number.
	 * @return Stack Linked List of anagram prime number.
	 */

	public static StackUsingLinkedList<String> anagramPrimeNumbersUsingStackLinkedList(int number) {
		StackUsingLinkedList<String> stackLinkedList = new StackUsingLinkedList<String>();
		String string1 = "";
		String string2 = "";

		ArrayList<Integer> prime = prime(number);
		System.out.println("\nPrime numbers that are Anagram\n");
		for (int i = 0; i < prime.size(); i++) {
			for (int j = i + 1; j < prime.size(); j++) {
				string1 = Integer.toString(prime.get(i));
				string2 = Integer.toString(prime.get(j));
				if (Utility.isAnagram(string1, string2)) {
					stackLinkedList.push(string1 + " " + string2);
				}

			}
		}
		return stackLinkedList;
	}
}
